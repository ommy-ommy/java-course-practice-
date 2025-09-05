import java.util.Scanner;
public class greatestnumber{
    public static void greatestOfThem(int a, int b, int c){
        if(a>=b && a>=c){
            System.out.println("The greatest number is :",a);
        }else if(b>=a && b>=c){
            System.out.println("The greatest number is :",b);
        }else if(c>=a && c>=b){
            System.out.println("The greatest number is :",c);
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        greatestOfThem(a, b, c);
    }
}