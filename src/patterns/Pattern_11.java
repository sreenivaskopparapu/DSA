package patterns;

public class Pattern_11 {
    public static void main(String[] args) {
        int n=4;
        boolean order=true;
        for(int i=n;i>=1;i--){
            int count=(i*(i+1))/2;
            for(int j=1;j<=i;j++){
                if(order){
                    System.out.print(count+" ");
                    count--;
                }
                else{
                    int x=count-i+1;
                    System.out.print(x+" ");
                    count=count+1;
                }
            }
            order=!order;
            System.out.println();
        }
    }
}
