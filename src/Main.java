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

        do {

            System.out.println("Do you find this loop annoying?");
            Scanner scAnswer = new Scanner(System.in);
            String answer = scAnswer.nextLine();

        } while (true);

    }
}