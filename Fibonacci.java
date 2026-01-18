import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter Elements for Series:");
        int n=s1.nextInt();

        int first=0,second=1;
        int next;
        
        // Logic for fibonacci
        for(int i=1;i<=n;i++){
            System.out.print(first+",");
            next = first + second;
            first = second;
            second = next;
        }
    } 
}
