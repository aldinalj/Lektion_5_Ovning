import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("What is your name, player?");
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();
        System.out.println("Player #1: " + player);

        System.out.println("How many times do you want the loop to run?");
        int loopCount = sc.nextInt();

        for (int i = 0; i < loopCount; i++) {
            System.out.println(i);
        }

       /* do {


           System.out.println("Do you find this loop annoying?");
           Scanner scAnswer = new Scanner(System.in);
           String answer = scAnswer.nextLine();


       } while (true); */

        boolean isPlaying = true;

        do {

            System.out.println("Do you want to run or stop?");
            Scanner scRunStop = new Scanner(System.in);
            String runOrStop = scRunStop.nextLine();

            if (runOrStop.equals("stop")) {
                isPlaying = false;
            }

        } while (isPlaying);

        boolean isRunning = true;

        do {

            System.out.println("Write 1 or stop");
            Scanner scOneStop = new Scanner(System.in);
            String switcheroo = scOneStop.nextLine();

            switch (switcheroo) {
                case "stop":
                    isRunning = false;
                    break;
                case "1":
                    System.out.println("Throwing");
                    break;
                default:
                    System.out.println("Wrong input");
            }

        } while (isRunning);

        while (true) {

            System.out.println("Type in an integer");
            Scanner number = new Scanner(System.in);

            if (number.hasNextInt()) {
                int userNumber = number.nextInt();
                System.out.println("You entered: " + userNumber);
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer!");
                number.nextLine();
            }

        }
    }
}




