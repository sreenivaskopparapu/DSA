package patterns;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class Pattern_18 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int count=1;
            for(int j=1;j<=i;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
