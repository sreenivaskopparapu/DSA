package patterns;
/* stopwatch pattern
 * * * * *
   * * *
     *
     *
   * * *
 * * * * *
 */
public class Pattern_22 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i-1;j++)
                System.out.print("  ");
            for(int st=0;st<2*(n-i)+1;st++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0;j<i-1;j++)
                System.out.print("  ");
            for(int st=0;st<2*(n-i)+1;st++)
                System.out.print("* ");
            System.out.println();
        }

    }
}
