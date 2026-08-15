package patterns;
/*
pascal triangle
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
*/
public class Pattern_13 {
    public static void main(String[] args) {
        int n=5;
        int[][] a = new int[n][n];
        for(int i=0;i<5;i++){
            for(int sp=0;sp<n-i;sp++)
                System.out.print(" ");
            for(int j=0;j<=i;j++) {
                if(j==0||i==j)
                    a[i][j]=1;
                else
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
 for this pattern first we have to write code for number triangle like below
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 create two dimensional array first with n size
for first colums and row equals to column value is 1 (j==0 or j==i => a[i][j]=1
next the a[i][j]=a[i-1][j-1]+a[i-1][j]
 */