package patterns;
/*
Full Diamond
  *
 * *
* * *
 * *
  *
 */
public class Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++)
                System.out.print(" ");
            for (int st=1;st<=i;st++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++)
                System.out.print(" ");
            for (int st=1;st<=i;st++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
