package thinkinginjava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

//PushbackInputStreamѧϰʵ��
public class GetIntFromFile {
	
	public  int getint(PushbackInputStream input){
	
		int c,res=0;
		try {
			//�����հ�
			while((c = input.read()) == ' ')
				;
			//�������֣�����+-����
			if(!isDigit(c) && c!= -1 && c != '+' && c!= '-'){
				input.unread(c);
				return -1;  //�����Ĳ���һ������
			}
			
			int sign = (c == '-') ?-1:1; //����
			if(c == '+' || c == '-')
				c = input.read();
			
			for(res = 0; isDigit(c); c = input.read())
				res = 10 * res + (c - '0');
			
			res *= sign;
			
			if(c != -1)
				input.unread(c);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return res;
	}
	
	private boolean isDigit(int c) {
		if(c >= '0' && c <= '9')
			return true;
		return false;
	}

	public static void main(String[] args) {
		try {
			//����1������ÿ��������һ���ֽ�
			PushbackInputStream input = new PushbackInputStream(
			        new FileInputStream("c:\\input.txt"), 1);
			System.out.println((new GetIntFromFile().getint(input)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
