import java.util.Scanner;

public class TryingMethods {
    // This class contains 4 methods
    // The first is a static method which returns the sum of all numbers between 1
    // and 1000
    public static void main(String[] args) {
        int b = 1;
        int theSum = 0;
        while (b < 1001) {
            theSum += b;
            b++;
        }
        System.out.println("The sum of all numbers between 1 and 1000 is: " + theSum);
        // daysOfTheWeek();
        TryingMethods WeekRotate = new TryingMethods();
        WeekRotate.daysOfTheWeek(5);

        TryingMethods Statement = new TryingMethods();
        Statement.conditionalStatement(35);

        Summing();
        //
    }

    public void daysOfTheWeek(int numberOfTheDay) {
        System.out.println("What is the number of the day?");
        Scanner dayScan = new Scanner(System.in);
        int numberOfTheDy = dayScan.nextInt();
        numberOfTheDay = 5;
        switch (numberOfTheDy) {
            case 1:
                System.out.println("That means today is Monday");
                break;
            case 2:
                System.out.println("That means today is Tuesday");
                break;
            case 3:
                System.out.println(" That means today is Wednesday");
                break;
            case 4:
                System.out.println(" That means today isThursday");
                break;
            case 5:
                System.out.println("That means today is Friday");
                break;
            case 6:
                System.out.println("That means today is Saturday");
                break;
            case 7:
                System.out.println("That means today is Sunday");
                break;

        }
    }

    public void conditionalStatement(int placeholder) {
        System.out.println("What was your exam score?");
        Scanner score = new Scanner(System.in);
        int examScore = score.nextInt();

        if (examScore >= 70) {
            System.out.println("That means you made an A");
        } else if (examScore < 45) {
            System.out.println("That means you made an F");
        }

        else {
            System.out.println("That means you are average");
        }
    }

    public static void summing() {

    }
}