package patterns;
/*
A
B C
D E F
G H I J
K L M N O
 */
public class Pattern_20 {
    public static void main(String[] args) {
        char ch ='A';
        for (int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
