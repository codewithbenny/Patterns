package Grid;
import java.util.Scanner;
public class NintoNGrid {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Value of n:");
       int n=sc.nextInt();
       int i=1;
       while(i<=n){
           for(int j=1;j<=n;j++){
               System.out.print("*");
           }
           System.out.println();

           i++;
       }
    }
}
