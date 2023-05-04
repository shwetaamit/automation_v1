package core;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String schlName="Indian Public School";  
		 String stdName ="Amit";
		 School sc= new School();
		 sc.studentName=stdName;
		 System.out.println(sc.studentName);
		 System.out.println(School.schoolName="ind");
		 
		 
	}

}

class School{
	public static String schoolName;
	public String studentName;
}