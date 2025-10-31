import java.util.Scanner;
public class CodeForces832DIV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-->0){
            int a = scanner.nextInt();
            int i=2;
            int j=3*n;
            System.out.println((n+1)/2);
            while(i<j){
                System.out.println(i+" "+j);
                i=i+3;
                j=j-3;
            }
        }
    }
    
}
