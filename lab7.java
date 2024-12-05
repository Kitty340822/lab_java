package lAb;
import java.util.Arrays;
import java.util.Scanner;
public class lab7 {
    public static void main(String[] args) {
        int[]n =new int[10];
        System.out.println("enter value:");
        Scanner a = new Scanner(System.in);
        for (int i =0;i<n.length;i++){
            int t = a.nextInt();
            n[i]=t;
        }
        for (int j=0;j<n.length;j++){
            Arrays.sort(n);
            System.out.println(n[j]);
        }
        
    }
    
}
