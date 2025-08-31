// import java.util.Scanner;

// public class fuctions {
//     public static int calculateMul(int a, int b){
//         int mul = a*b;
//         return mul;
//     }
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int mul = calculateMul(a,b);
//         System.out.println("the multiplication of 2 number is : "+mul);
//     }
    
// }

// import java.util.Scanner;
// public class functions{
//     public static void primrOrNot(int n){
//         int div = a%b;
//         return div; 
//     }
// }

import java.util.Scanner;
public class fuctions{
    public static void findPrimeOrNot(int n){
        if(n <= 1 && n%n==1 || n%1==n){
            System.out.println("Its a prime number.");
        }else{
            System.out.println("Its not a prime number.");
        }
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            findPrimeOrNot(n);
    }
}