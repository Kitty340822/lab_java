package lAb;
import java.util.Scanner;
public class lab5_popname {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pls input word : ");
        String a = in.nextLine();

        for (int i =0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
        
    }
    
}
