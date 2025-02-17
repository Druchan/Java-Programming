import java.util.Scanner;
class Even{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Number = dru.nextInt();
        if(Number % 2 ==0 ){
            System.out.println("It is Even Number.");
        }
        else{
            System.out.println("It is Odd Number.");
        }
    }
}