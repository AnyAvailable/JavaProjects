import java.util.Scanner;



class GetWeekDayByNumOneToSeven
{
    private static byte inputedNum;
    private static String dayOfWeek;
    GetWeekDayByNumOneToSeven()
    {
        print(getNumberAndOutWeekDay(input()));
    };


    private static String input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("input number of day of week");
        return input.nextLine();
    }
    private static String getNumberAndOutWeekDay(String text)
    {
        switch(Byte.parseByte(text))
        {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Thursday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Unknown";
        };
        switch(Byte.parseByte(text))
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayOfWeek += " | so it is busy day";
                break;
            case 6:
            case 7:
                dayOfWeek += " | so it is weekend";
                break;
        }
        return dayOfWeek;
    }
    private static void print(String obj)
    {
        System.out.println(obj);
    }
}



class Main
{
    public static void main(String[] args)
    {
        new GetWeekDayByNumOneToSeven();
    }
}
