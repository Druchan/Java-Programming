import java.util.Scanner;

class Excercise3 {
    public static void main (String[] args){
        Scanner dru = new Scanner(System.in);
        String name = dru.nextLine();
        float score = dru.nextInt();
        dru.nextLine();
        String department = dru.nextLine();
        
        System.out.println("My name is "+name);
        System.out.println("My score is "+score/10 +"/10");
        System.out.println("My deparrment is "+department);
    }
}