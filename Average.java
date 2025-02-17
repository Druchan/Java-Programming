import java.util.Scanner;
class Average{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter your Tamil Mark : ");
        int Tamil = dru.nextInt();
        System.out.print("Enter Your English Mark : ");
        int English = dru.nextInt();
        System.out.print("Enter Your Maths Mark : ");
        int Maths = dru.nextInt();
        System.out.print("Enter your Science Mark : ");
        int Science = dru.nextInt();
        System.out.print("Enter your Social Mark : ");
        int Social = dru.nextInt();
        int Total = Tamil+ English+ Maths+ Science+ Social;
        int Average = Total/5;
        if (Average < 35){
            System.out.println("Additional Class is Required");
        }
        else if (Average >= 35){
            System.out.println("You're Good to go....");
        }
    }
}