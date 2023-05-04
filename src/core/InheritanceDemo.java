package core;

public class InheritanceDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		A a = new A();
		a.a();
		a.a(100);
		
		A a1 = new B(); 
		//B b1= new A();
		//a1.a();// Runtime polymorphism
		
		B b = new B();
		b.a(); //Rntime polymorphism
		a1.a();
		Class c= Class.forName("A");
		A a4= (A)c.newInstance();
	}

}
class A{
	void a(){
		System.out.println("In parent A");
	}
	
	void a(int a) {
		System.out.println("In parent A - with parameter");
	}
}

class B extends A{
	void a() {
		System.out.println("In child B");
	}
}

interface G{};
interface H extends G {}

class S{
	String removeSpecialCharacters(String str) {
		
		return "";
	}
}







