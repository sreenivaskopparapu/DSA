package patterns;
/*
A B C D E
B C D E
C D E
D E
E
 */
public class Pattern_9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
                System.out.print((char)('A'+j)+" ");
            System.out.println();
        }
    }
}
