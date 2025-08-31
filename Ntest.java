import java.util.*;
class Ntest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Choose operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo");
        int calculator = sc.nextInt();
        
        switch(calculator){
            case 1 : 
            System.out.print("The addition of two number is : " +(a+b));
            break;
            case 2 : 
            System.out.print("The substraction of two number is : " +(a-b));
            break;
            case 3 : 
            System.out.print("The mulpilyer of two number is : " +(a*b));
            break;
            case 4 : 
            if(b != 0){
                System.out.print("The division of two number is : " +(a/b));
            }else{
                System.out.print("division by zero is not allowed");
            }
            break;
            case 5 : 
            if(b != 0){
                System.out.print("The modulo of two number is : " +(a%b));
            }else{
                System.out.print("Modulo by zero is not allowed");
            }
            break;
            default :
            System.out.println("Invalid operation");    

            
        }
    }
}
