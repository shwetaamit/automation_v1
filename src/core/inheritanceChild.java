package core;

public class inheritanceChild extends inheritancePar {

	
	static int i=10;

		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritancePar ic= new inheritanceChild();
		ic.A();
		ic.B();
		 
		System.out.println(i);
	}

}

