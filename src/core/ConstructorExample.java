package core;

public class ConstructorExample {
	public static void main(String[] args) {
		Aa a= new Aa();
		a.setHand(2);
		System.out.println("****"+a.getHand());
		Aa a2= new Aa(2);
		//WebDriver driver=new ChromeDriver();
		//driver.get();
	}
}

class Aa{
	int hand;
	Aa(){
		System.out.println("default constructor");
	}
	Aa(int i){
		this.hand=i;
		System.out.println("Aa initialized with hand\t"+hand);
	}
	public int getHand() {
		return hand;
	}
	public void setHand(int hand) {
		this.hand = hand;
	}
	
}
