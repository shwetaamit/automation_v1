package core;

public class childClassdemo extends parentClassdemo {
	public void company()
	{
		System.out.println("company");
	}
	public void colour() {
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassdemo c=new childClassdemo();
		c.Break();
		c.engine();
		c.gear();
		c.company();
		c.colour();
	
	}
}
