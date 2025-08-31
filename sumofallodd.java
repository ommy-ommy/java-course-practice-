public class sumofallodd{
    public static void sumOfAllOdd(int n){
     int sum = 0;
     for(int i=1; i<=n; i++){
        if(i%2 !=0){
         sum = sum +i;
        }
     }
     System.out.println("the sum of all odd number is :" +sum);
    }
    public static void main(String args[]){
    int n = 50;
    sumOfAllOdd(n);
    }
}
    
