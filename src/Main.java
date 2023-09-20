import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What is your name, player?");
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();
        System.out.println("Player #1: " + player);

    }
}
