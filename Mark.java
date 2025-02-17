import java.util.Scanner;
class Mark{
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        int chan = dru.nextInt();
        if(chan>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}