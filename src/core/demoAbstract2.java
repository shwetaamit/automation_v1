package core;

public class demoAbstract2 extends demoAbstract {

public void childclass() {
	System.out.println("this method is in child class");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoAbstract2 d=new demoAbstract2();
		d.airCraft();
		//d.airCraft2();
		d.aircraft3();
		d.childclass();
		//demoAbstract e=new demoAbstract();//we cannot create object of the class which is defined as ABSTRACT CLAA
	}

	@Override
	public void aircraft3() {
		// TODO Auto-generated method stub
		System.out.println("this is from demoabstract but override in abstractdemo2");
	}

}
