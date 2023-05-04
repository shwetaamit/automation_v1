package core;

import demopack.Tsignal.CentralTrafic;
import ssk.signal;

public class IndianTrafic  implements CentralTrafic, FromOtherPkg,signal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTrafic a=new IndianTrafic();
		a.GreenGo();
		a.RedGo();
		a.YellowSignal();
		

		
		signal c=new IndianTrafic();
		c.bangaloreRule();

		
		
		IndianTrafic d=new IndianTrafic();
		d.rules();
	}
	
	

	public void bangaloreRule() {
		// TODO Auto-generated method stub
		System.out.println("bangalore rule");
	}



	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green signal");
	}

	@Override
	public void RedGo() {
		// TODO Auto-generated method stub
		System.out.println("Red signal");
	}

	@Override
	public void YellowSignal() {
		// TODO Auto-generated method stub
		System.out.println("Yellow signal");
	}


	@Override
	public void rules() {
		// TODO Auto-generated method stub
		System.out.println("This from same package but diffrent class");
	}

}
