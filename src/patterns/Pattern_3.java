package patterns;
/*
pyramid pattern
    *
   * *
  * * *
 * * * *
* * * * *
 */
public class Pattern_3 {
    public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=n-i;j++)
            System.out.print(" ");
        for(int st=1;st<=i;st++)
            System.out.print("* ");
        System.out.println();
    }
    }
}
