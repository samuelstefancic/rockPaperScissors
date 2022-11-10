import java.util.Scanner;

public class RockPaperCissor {
    public static void main(String[] args) {
            isReady();
            userInput();
            //humanChoice();
            //computerChoice();
            result(humanChoice(), computerChoice());
    }

    public static void isReady() {
        System.out.println("Welcome to my magnificent game");
        System.out.println("Today, you will face the most advanced AI built");
        System.out.println("Based on the best of the technology (if else)");
        System.out.println("And ... no refunds on this, try to enjoy it !");
    }

    public static void userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nReady ? Type yes if you want to start, any other input will exit the game ;)");
        String inputValidation = scan.nextLine();
        switch (inputValidation) {
            case "yes": System.out.println("\nAlright, let's go ! "); break;
            default: System.out.println("Bye !"); System.exit(0); break;
        }
        //yesSystem.out.println("Select, rock, paper or scissor");
        //String userInput = scan.nextLine();
        //yesscan.close();
    }

public static String humanChoice() {
    Scanner scanHuman = new Scanner(System.in);
    System.out.println("Select, rock, paper or scissor");
    String userInput = scanHuman.nextLine();
    switch(userInput) {
        case "rock": System.out.println("You choosed rock");scanHuman.close(); return "rock";
        case "paper": System.out.println("You choosed paper");scanHuman.close(); return "paper";
        case "scissor": System.out.println("You chosed scissor");scanHuman.close(); return "scissor";
        case "exit": System.out.println("\nYou choosed to exit the game, everything will go blank for now, please stay awake during the process"); System.exit(0);
        default: System.out.println("Wrong input, the game will start again.");scanHuman.close(); return humanChoice();
    }
    
}

    public static String computerChoice() {
        double randomNumber = (Math.random() * 3 + 1);
        int computerInput = (int)randomNumber;
        switch(computerInput) {
            case 1: System.out.println("The computer choosed rock"); return "rock";
            case 2: System.out.println("The computer choosed paper");  return "paper";
            case 3: System.out.println("The computer choosed scissors"); return "scissors";
            default: return "";
        }
    }

    public static String result(String humanChoice, String computerChoice) {
        String result = "";
        if (humanChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (humanChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (humanChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (humanChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (humanChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (humanChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (humanChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        System.out.println(result);
        return result;
      }
//Faire une fonction comparant les deux résultats, en l'appelant directement dans le main

   public static void computerInput() {
    //Scanner scan2 = new Scanner(System.in);
            int x = (int)(Math.random() * 3 + 1);
            String result;
            if (x == 1) {
                result = "rock";
                System.out.println(result);
            } else if (x == 2) {
                result = "rock";
                System.out.println(result);
            } else if (x == 3) {
                result = "rock";
                System.out.println(result);
            }
    }

}


            //scan2.close();
           // return result;
       /*  return switch(x) {
            case 1: System.out.println("rock"); break;
            case 2: System.out.println("paper"); break;
            case 3: System.out.println("scissor"); break;

                    String computerStored = Integer.toString(computerInput);
            if (computerStored.equals(userInput) == true) { 
                System.out.println("prout");
            } else {
                System.out.println("Rien ne fonctionne");
            }
        }*/