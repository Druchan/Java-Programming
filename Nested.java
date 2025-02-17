import java.util.Scanner;
class Nested{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter Your Salaray : ");
        int Salary = dru.nextInt();
        System.out.print("Enter your Age : ");
        int Age = dru.nextInt();
        if (Salary >= 20000 && Age <=25){
            System.out.print("Enter the Required Loan Amount : ");
            int loan = dru.nextInt();
            if(loan <= 50000){
                System.out.println("Congratulations you're Eligible for the loan");
            }
            else if(loan >5000){
                System.out.println("Maximum loan Amount is 50000");
            }
        }
        else{
            System.out.println("You're not Eligible for the Loan.");
        }
    }
}