package thinkinginjava.io;

import java.io.*;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		// �ײ�ά�������ַ����洢
		StringReader in = new StringReader(
				BufferedInputFile.read("README.txt"));
		int c;
		while ((c = in.read()) != -1)
			System.out.print((char) c);
	}
} 
