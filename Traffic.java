import java.util.Scanner;
class Traffic {
    public static void main(String[] args){
        Scanner dru = new Scanner(System.in);
        System.out.print("Enter the Colour :");
        String traf = dru.nextLine();
        if(traf.equals("red")){
            System.out.println("Stop...");
        }
        else if(traf.equals("yellow")){
            System.out.println("Get ready....");
        }
        else if(traf.equals("green")){
            System.out.println("Go.....");
        }
        else{
            System.out.println("Please Enter the Valid Colo");
        }
    }
}