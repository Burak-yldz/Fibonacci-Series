
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Fibonacci amount : ");
        int n = scn.nextInt();
        int total = 0, beforeNum1 = 0, beforeNum2 = 1;

        for(int i=0; i<=n; i++){
            if(i == 0){

                total = beforeNum1;
            }else if(i == 1) {

                total = beforeNum1 + beforeNum2;
            }else{
                total = beforeNum1 + beforeNum2;
                beforeNum1 = beforeNum2;
                beforeNum2 = total;
            }
            System.out.print(total + " ");
        }
    }
}
