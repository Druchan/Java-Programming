import java.util.Scanner;
class Cricket{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter your Score :");
        int Score = dru.nextInt();
        if (Score < 50){
            System.out.println("You need to Improve...");
        }
        else if (Score >= 50 && Score >= 70){
            System.out.println("Good job...");
        }
        else if (Score > 70){
            System.out.println("Excellent Performance...");
        }
    }
}