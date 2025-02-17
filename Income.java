import java.util.Scanner;
class Income{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        int Income = dru.nextInt();
        if(Income >= 7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Sorry you're not Eligible");
        }
    }
}