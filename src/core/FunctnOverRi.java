package core;

public class FunctnOverRi extends parentClassdemo{
	public void engine() {
		System.out.println("updraded verion of engine");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctnOverRi r=new FunctnOverRi();
		r.engine();//overriding
		r.gear();
		
		//function override will have same method name, same signature but its takes local value mean override with local methos
	}

}
