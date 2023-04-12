public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }
    public static boolean isLeapYear(int year)
    {
        if(year>=1 && year <=9999)
        {
            if(year%4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }return true;
            }return false;
        }return false;
    }

    public static int getDaysInMonth(int month, int year)
    {
        if(month<1 || month>12)
            return -1;
        {
            if(year<1 || year>9999)
                return -1;
            {
                if(isLeapYear(year) && month==2)
                {return 29;}

                else if(!isLeapYear(year) && month==2)
                {return 28;}

                else if(month==1)
                    return 31;
                else if(month==3)
                    return 31;
                else if(month==4)
                    return 30;
                else if(month==5)
                    return 31;
                else if(month==6)
                    return 30;
                else if(month==7)
                    return 31;
                else if(month==8)
                    return 31;
                else if(month==9)
                    return 30;
                else if(month==10)
                    return 31;
                else if(month==11)
                    return 30;
                else if(month==12)
                    return 31;
            }
        }
        return 1;
    }
}
