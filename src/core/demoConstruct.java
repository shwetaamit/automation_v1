package core;

public class demoConstruct {
	
	
	public demoConstruct() {
		
		System.out.println("I am default constructor");
	}
	
	public demoConstruct(int i,int j) {
		
		System.out.println("i am Parameterize constructor");
	}
	
	
	
	
	
	
	public void getData() {
		System.out.println("i am a method");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demoConstruct dc=new demoConstruct(4,5);
	}

}
