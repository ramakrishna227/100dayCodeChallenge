package problemSolving;

public class MatrixMultiplication {
public static void main(String[] args) {
  int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
  int[][] b= {{10,11,12},{13,14,15},{16,17,18}};
  matrixMultiply(a,b);
}

private static void matrixMultiply(int[][] a, int[][] b) {
  int[][] c=new int[a[0].length][b.length];
for(int i=0; i<a[0].length; i++) {  
  for(int j=0; j<b.length;j++) {
    int result=0;
    for(int k=0;k<a[0].length; k++) {
      result=result+(a[i][k]*b[k][j]);
    }
    c[i][j]=result;
  }
}

for(int[] arr:c) {
  for(int i: arr) {
    System.out.print(i+" ");
  }
  System.out.println();
}
}
}
