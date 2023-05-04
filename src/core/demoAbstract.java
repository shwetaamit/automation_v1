package core;

public abstract class demoAbstract implements FromOtherPkg{

	public void airCraft() {
		System.out.println("aircraft");
	}
	
	public void airCraft(int i) {
		System.out.println("aircraft");		
		System.err.println("Aircraft2");
	}
	
	public abstract void aircraft3();
	

}

class D extends demoAbstract {

	public void aircraft3() { // TODO Auto-generated method stub
		System.out.println("In class D");
	}

	@Override
	public void rules() { // TODO Auto-generated method stub

	}
}
 