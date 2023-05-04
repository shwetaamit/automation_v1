package core;
//function overloading- same method name
//either argument count should be diff or argument data type should be diff
public class FunctOverL extends parentClassdemo{
	
	 public void getData(int a) {
		 System.out.println(a);
	 }
 public void getData1(int b) {
	 System.out.println(b);	 
	 }
 public void getData(String a) {
	 System.out.println(a);
 }
 public void getData(char c) {
	 System.out.println(c);
 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctOverL f=new FunctOverL();
		f.getData(54);
		f.getData(20); 
		f.getData("Shweta");
		f.getData1(35);
		f.engine();
	}

}
