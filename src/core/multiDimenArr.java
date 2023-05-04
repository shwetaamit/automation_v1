package core;

public class multiDimenArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a[row][column]=== 2 3 4
		//                  6 7 8 
		int x[][]=new int[2][3];
		
		x[0][0]=2;
		x[0][1]=3;
		x[0][2]=4;
		x[1][0]=6;
		x[1][1]=7;
		x[1][2]=8;
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
				System.out.println(x[i][j]);
		}
		
		
	}

}
