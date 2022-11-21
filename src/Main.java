import java.util.Objects;
import java.util.Scanner;

import static java.util.Calendar.MONDAY;

public class Main {
    public static void main(String[] args) {

        Week[] weeks = Week.values();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        String dayOfWeek = scanner.nextLine().toUpperCase();
            System.out.println("Please write your day of week");
        for (Week week : weeks) {
            if (week.name().equals(dayOfWeek))

                    switch (week) {
                        case MONDAY:
                            System.out.println("Дүйшөмбү күнү жава окуйм.");
                            break;
                        case TUESDAY:
                            System.out.println("Бейшемби күнү практикалык сабак.");
                            break;
                        case WEDNESDAY:
                            System.out.println("Шейшемби күнү англис тили жана жава окуйм. ");
                            break;
                        case THURSDAY:
                            System.out.println("Бейшемби күнү софт скиллс болот.");
                            break;
                        case FRIDAY:
                            System.out.println("Жума күнү жава окуйм.");
                            break;
                        case SATURDAY:
                            System.out.println("Ишемби күнү эс алам");
                            break;
                        case SUNDAY:
                            System.out.println("Жекшемби күнү сабак даярдайм");
                            break;

                    }

                }
        }
    }
}