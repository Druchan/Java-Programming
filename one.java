import java.util.Scanner;
class one{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter your Mark :");
        int chan = dru.nextInt();
        if(chan>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}