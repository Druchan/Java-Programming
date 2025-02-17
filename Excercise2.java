import java.util.Scanner;

class Excercise2{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        int a = dru.nextInt();
        int b = dru.nextInt();
        int c = dru.nextInt();
        int d = a*b*c ;
        int e = a+b+c ;
        System.out.println(d/e);
    }
}