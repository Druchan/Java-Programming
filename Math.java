import java.util.Scanner;
class Math{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Number = dru.nextInt();
        if(Number %3 == 0 && Number%5 == 0){
            System.out.println("The Number is divisible by both 3 and 5");
        }
        else{
            System.out.println("The Number is not divisible by both 3 and 5");
        }
    }
}