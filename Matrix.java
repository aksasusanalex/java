package programs;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int[][] mat=new int[4][3];
		int[][] trans=new int[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix elements");
		for(int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				mat[i][j] =sc.nextInt();
		
				
				
			}
				
		}
		System.out.println("Orginal matrix:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mat[i][j]+ "\t");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				trans[i][j] =mat[j][i];
						
				
				
			}
				
		}
		System.out.println("Transposed Matrix :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
		
	}}

}
