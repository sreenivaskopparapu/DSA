package patterns;
/*
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
 */
public class Pattern_24 {
    public static void main(String[] args) {
        int n=3;
        int center =n-1;
        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
            int val=1+Math.max(Math.abs(i-center),Math.abs(j-center));
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
