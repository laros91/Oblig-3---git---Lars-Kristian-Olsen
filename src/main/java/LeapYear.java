public class LeapYear {
    public static boolean isLeapYear(int year) {

        if (isDivisibleByFour(year) == true && isDivisibleByOneHundred(year) == false){
            return true;
        }

        else if (isDivisibleByFourHundred(year)){
            return true;
        }

        else return false;
    }

    public static boolean isDivisibleByFour(int year){
         return year % 4 == 0;
    }

    public static boolean isDivisibleByOneHundred (int year){
        return year % 100 == 0;
    }

    public static boolean isDivisibleByFourHundred (int year){
        return year % 400 == 0;
    }
}
