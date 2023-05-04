package core;

public class MinimumNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][] = {{2,3,4},{7,6,5},{1,9,8}};
 int min=abc[0][0];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < abc.length; j++) {
			if (abc[i][j] > min)
			{

				min = abc[i][j];

			}

		}

	}

	System.out.println(min);
}
}
