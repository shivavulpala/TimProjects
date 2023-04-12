public class Main {
    public static void main(String[] args) {
        System.out.println("quarter of the entered month is: "+getQuarter("jan"));
        System.out.println(getQuarter("dec"));
        System.out.println(getQuarter("ahu"));
        System.out.println(getQuarter("mar"));
        System.out.println(getQuarter("jun"));
        int value=4;
        switch (value) {
            case 1, 2, 3, 4, 5 -> System.out.println("value is " + value);
            default -> System.out.println("value is other than 1,2,3,4,5");
        }
    }

    public static String getQuarter(String month)
   {
        return switch(month)
        {
            case "jan","feb","mar"->"1st";
            case "apr","may","jun"-> "2nd";
            case "jul","aug","sep"-> "3rd";
            case "oct","nov","dec"-> "4th";

            default ->"bad";

        };
    }
}
