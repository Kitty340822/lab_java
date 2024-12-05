package lAb;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        int i,sum;
        System.out.print("Enter score: ");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        i=0;
        sum=0;
        while(i<score){
            i=i+1;
            sum = sum+i;

        }
        System.out.println("result = "+sum);
    }
    
}
