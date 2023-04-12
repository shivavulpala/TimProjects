import org.w3c.dom.ls.LSOutput;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(8);
        printWeekDay(7);
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
    }
    public static void printDayOfWeek(int day)
    {
            String dayOfWeek= switch(day) {
                case 0->"sunday";
                //case 0 -> {yield "Sunday";}
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid day";
            };
        System.out.println(day+ " stands for " +dayOfWeek);
    }

    public static void printWeekDay(int day)
    {
            //String dayOfWeek="invalid day";
        if(day==0)
            //dayOfWeek="sunday";
            System.out.println(day+" : Sunday");
        else if(day==1)
            System.out.println(day+ " : Monday");
        else if(day==2)
            System.out.println(day+ " : Tuesday");
        else if(day==3)
            System.out.println(day+ " : Wednesday");
        else if(day==4)
            System.out.println(day+ " : Thursday");
        else if(day==5)
            System.out.println(day+ " : Friday");
        else if(day==6)
            System.out.println(day+ " : Saturday");
        else
            System.out.println("Invalid day, enter a day number from 0-6");

        //System.out.println(day+" stands for " +dayOfWeek);
    }
}
