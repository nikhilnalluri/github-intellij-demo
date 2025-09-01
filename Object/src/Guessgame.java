import java.util.*;
public class Guessgame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10) + 1; // Random 1–10
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number (1-10): ");
        int guess = sc.nextInt();
        if (guess == num) System.out.println("🎉 Correct!");
        else System.out.println("❌ Wrong! The number was " + num);
    }
}