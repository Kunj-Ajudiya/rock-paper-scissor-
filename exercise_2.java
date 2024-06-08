import java.util.Random;
import java.util.Scanner;

public class exercise_2 {
    static int Upoint = 1;
    static int Cpoint = 1;
    
    public static void main(String[] args) {
        Random ran = new Random();

        String[] choose ={"rock", "paper", "scissor"};

        Scanner nm = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = nm.nextLine();
        System.out.println("\nHello "+name+"! \nLet's play a game of rock, paper and scissors!");
        System.out.println(name + " VS Computer");

        System.out.println("\n");
        System.out.println("\n");

        int i=0;
        while (i != 5) {
            System.out.println("Choose your choise :");
            String choice = nm.nextLine();
        
            System.out.println("\n");

            int comIndex =  ran.nextInt(3);
        
            System.out.println("Computer :  \n" + choose[comIndex]);
        
                if (choice.equalsIgnoreCase(choose[comIndex])) {
                System.out.println("Same\n\n");
            }
            else if(choose[comIndex].equalsIgnoreCase("rock") && choice.equalsIgnoreCase("paper")) {
                Cpoint++;
                System.out.println(name +" Won\n\n");
            }
            
            else if((choose[comIndex].equalsIgnoreCase("scissor")) && choice.equalsIgnoreCase("rock")) {
                Cpoint++;
                System.out.println(name +" Won\n\n");
            }
            else if((choose[comIndex].equalsIgnoreCase("paper")) && choice.equalsIgnoreCase("scissor")) {
                Cpoint++;
                System.out.println(name + " Won\n\n");
            }
            else if((choose[comIndex].equalsIgnoreCase("scissor")) && choice.equalsIgnoreCase("paper")) {
                Upoint++;
                // System.out.println("Computer Won\n");
                System.out.println("Computer Won\n\n");
            }
            else if((choose[comIndex].equalsIgnoreCase("paper")) && choice.equalsIgnoreCase("rock")) {
                Upoint++;
                System.out.println("Computer Won\n\n");
            }
            else if((choose[comIndex].equalsIgnoreCase("rock")) && choice.equalsIgnoreCase("scissor")) {
                Upoint++;
                System.out.println("Computer Won\n\n");
            }
                i++;
        }
            if (Upoint < Cpoint) {
                System.out.println(name +" Won with "+Upoint +" points ");
            }
            else if(Upoint > Cpoint) {
                System.out.println("\nComputer Won with " + Cpoint + " points");
            }
            else {
                System.out.println("\nMatch draw\n");
            }
    }
}
