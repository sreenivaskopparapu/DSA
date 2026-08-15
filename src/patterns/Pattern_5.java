package patterns;
/*
 * * * * *
   * * * *
     * * *
       * *
         *
 */
public class Pattern_5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=5;i>=1;i--){
            for(int space=0;space<2*(n-i);space++) // either 2*(n-i) or double space in print
                System.out.print(" ");
            for(int st=1;st<=i;st++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
