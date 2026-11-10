import java.util.Scanner;

public class Timebreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " Hour(s)");
        System.out.println(minutes + " Minute(s)");
        System.out.println(seconds + " second(s)");

        scanner.close();
    }
}