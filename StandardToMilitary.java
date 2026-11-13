import java.util.Scanner;
public class StandardToMilitary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour (1-12): ");
        int hour = scanner.nextInt();
        System.out.print("Enter minute (0-59): ");
        int minute = scanner.nextInt();
        System.out.print("Enter AM (1) or PM (2): ");
        int amPm = scanner.nextInt();
        String militaryTime = convertToMilitary(hour, minute, amPm);
        System.out.println("Military time: " + militaryTime);
    }

    public static String convertToMilitary(int hour, int minute, int amPm) {
        if (amPm == 2 && hour != 12) {
            hour += 12;
        } else if (amPm == 1 && hour == 12) {
            hour = 0;
        }
        return String.format("%02d%02d", hour, minute);
    }
}