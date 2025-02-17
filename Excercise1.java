import java.util.Scanner;
class Excercise1{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        String name = dru.nextLine();
        String address = dru.nextLine();
        int age = dru.nextInt();
        System.out.println("My name is :"+name);
        System.out.println("My age is :"+age);
        System.out.println("My Address is:"+address);
    }
}