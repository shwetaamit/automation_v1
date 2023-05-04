package core;

import java.io.FileReader;

public class ExceptionExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("first line");
		int i=100%10;
		System.out.println(i);
		int j=0;
		try {
			j=100/0;//Runtime Exception
		}catch(Exception e) {
			e.printStackTrace();
		}
		//int k= 10/0;
		System.out.println(j);
		System.out.println("Last Line");
		FileReader fr= new FileReader("in.txt");
		fr.read();
	}
}

class F implements Cloneable{
	
}

