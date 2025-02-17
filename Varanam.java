import java.util.Scanner;
class Varanam{
    public static void main(String[] args){
        Scanner GVM = new Scanner(System.in);
        String Meghana = GVM.nextLine();
        if(Meghana.equals("Dead")){
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surya weds Meghana");
        }
    }
}