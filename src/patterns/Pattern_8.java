package patterns;
/* Righ Angled Triangle with alphabet(A-B-C)
A
A B
A B C
A B C D
A B C D E
 */
public class Pattern_8 {
    public static void main(String[] args) {
      for (int i=1;i<=5;i++){
          char ch='A';
          for(int j=1;j<=i;j++)
              System.out.print((char)(ch+j-1)+" ");
          System.out.println();
      }

    }
}
