package day16;

public class LatticePaths {
	static int number=20;
	static long[][] grid=new long[21][21];
	public static void main(String[] args) {
	grid[0][0]=0;
	
	for(int i=1; i<=number;i++) {
		grid[i][0]=1;
		grid[0][i]=1;
	}
	
	for(int i=1; i<=number; i++) {
		for (int j=1; j<=i;j++) {
			grid[i][j]=grid[j][i]=grid[j-1][i]+grid[j][i-1];
		}
	}
	
	System.out.println(grid[20][20]);
	}
			
}
