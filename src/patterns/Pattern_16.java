package patterns;
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

observ every odd row starts with 1 and even with 0
 */
public class Pattern_16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int st=i%2==1?1:0;
            for(int j=1;j<=i;j++){
                System.out.print(st+" ");
                st=1-st;
            }
            System.out.println();
        }
    }
}

/*
for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print(j%2==0?"0 ":"1 ");
            System.out.println();
        }
 */