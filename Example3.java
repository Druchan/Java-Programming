import java.util.Scanner;
class Example3{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        int num1 = dru.nextInt();
        int num2 = dru.nextInt();
        if(num1==num2){
            System.out.println("Both the numbers are same");
        }
        else if(num1>num2){
            System.out.println("Number 1 is greater");
        }
        else{
            System.out.println("Number 2 is greater");
        }
    }
}