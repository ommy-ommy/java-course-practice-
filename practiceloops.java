// import java.util.Scanner;

// public class practiceloops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=2; i<n; i+=2){
//             System.out.println(i);
//         }
//     }
// }

import java.util.Scanner;

public class practiceloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter 1 to input student’s marks, 0 to stop: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered.");
                }
                System.out.println("Because marks don’t matter but our effort does.");
            }
        } while (choice != 0);

        System.out.println("Program stopped.");
    }
}