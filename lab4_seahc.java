package lAb;
import java.util.Scanner;
public class lab4_seahc {
    public static void main(String[] args) {
        
        
        System.out.println("Enter Character: ");
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        c = c.toLowerCase();
        System.out.println("Enter the sentence: ");
        String a = s.nextLine();
        a = a.toLowerCase();

        int ans =0;
        for (int i=0;i<a.length();i++){
            if (c.charAt(0)==a.charAt(i)){
                ans = ans+1;

            }
            else
                ans = ans;

        }
        if(ans>=1){
            System.out.print(ans);
        }
        else    
            System.out.print("There isn't "+c);


    }
    
}
