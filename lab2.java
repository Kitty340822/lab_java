package lAb;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        System.out.println("Enter Number1: ");
        Scanner in = new Scanner(System.in);
        Double Number1 = in.nextDouble();
        System.out.println("Enter Number2: ");
        Double Number2 = in.nextDouble();
        Double result = Number1-Number2;
        if (result<=0.1 && result>=-0.1){
            System.out.print("Number1:"+Number1+"close"+"Number2:"+Number2);

        }
        else 
            System.out.print("Number1:"+Number1+"don't close"+"NUmber2:"+Number2);
    }
    
}
