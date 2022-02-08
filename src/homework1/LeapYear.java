package homework1;

public class LeapYear {

    /* Question 5 - HomeWork 1
     * Write a program to determine whether the year is a leap year or not.
     * For a year to be a leap year  -
     * Leap Years are any year that can be evenly divided by 4.
     * A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
     *
     */
    public boolean isLeapYear(int year){

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }
}
