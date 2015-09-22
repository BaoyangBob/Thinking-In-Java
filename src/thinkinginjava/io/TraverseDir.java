package thinkinginjava.io;


import java.io.File;

public class TraverseDir { 
	public static void main(String[] args) { 
	File f = new File("C:\\data"); 
	System.out.println(f.getName()); 
	tree(f, 1); 

	} 

	// �ݹ鷽�� 
private static void tree(File f, int level) { 
	String preStr = ""; 
	for (int i = 0; i < level; i++) { 
		preStr += "-"; 
	} 

	File[] childs = f.listFiles(); //listFiles()����Ŀ¼�µ������ļ�. 
	for (int i = 0; i < childs.length; i++) { 
		System.out.println(preStr + childs[i].getName()); 
		if (childs[i].isDirectory()) { //isDirectory()�ж��Ƿ�ΪĿ¼ 
			tree(childs[i], level + 1); 
		} 
	} 
	} 
}
