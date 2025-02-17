import java.util.Scanner;
class Ex2{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter num1 :");
        int num1 = dru.nextInt();
        System.out.print("Enter num2 :");
        int num2 = dru.nextInt();
        String result = (num1 > num2)?"num1 is greater":"num2 is greater";
        System.out.print(result);
    }
}