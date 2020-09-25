package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();
        int dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        int month = myCal.get(Calendar.MONTH);
        int year = myCal.get(Calendar.YEAR);
        int weekday = myCal.get(Calendar.DAY_OF_WEEK);

        if (month==0){
            System.out.println("The current date is January "+dayOfMonth+", "+year);
        }
            else if (month==1) {
                System.out.println("The current date is February "+dayOfMonth+", "+year);
            }
            else if (month==2) {
                System.out.println("The current date is March "+dayOfMonth+", "+year);
            }
            else if (month==3) {
                System.out.println("The current date is April "+dayOfMonth+", "+year);
            }
            else if (month==4) {
                System.out.println("The current date is May "+dayOfMonth+", "+year);
            }
            else if (month==5) {
                System.out.println("The current date is June "+dayOfMonth+", "+year);
            }
            else if (month==6) {
                System.out.println("The current date is July "+dayOfMonth+", "+year);
            }
            else if (month==7) {
                System.out.println("The current date is August "+dayOfMonth+", "+year);
            }
            else if (month==8) {
                System.out.println("The current date is September "+dayOfMonth+", "+year);
            }
            else if (month==9) {
                System.out.println("The current date is October "+dayOfMonth+", "+year);
            }
            else if (month==10) {
                System.out.println("The current date is November "+dayOfMonth+", "+year);
            }
            else if (month==11) {
            System.out.println("The current date is December "+dayOfMonth+", "+year);
            }
        else {
                System.out.println("Not a month");
        }
        if (month==0){
            System.out.println("The month is January");
        }
            else if (month==1) {
                System.out.println("The month is February");
            }
            else if (month==2) {
                System.out.println("The month is March");
            }
            else if (month==3) {
                System.out.println("The month is April");
            }
            else if (month==4) {
                System.out.println("The month is May");
            }
            else if (month==5) {
                System.out.println("The month is June");
            }
            else if (month==6) {
                System.out.println("The month is July");
            }
            else if (month==7) {
                System.out.println("The month is August");
            }
            else if (month==8) {
                System.out.println("The month is September");
            }
            else if (month==9) {
                System.out.println("The month is October");
            }
            else if (month==10) {
                System.out.println("The month is November");
            }
            else if (month==11) {
                System.out.println("The month is December");
            }
        else {
            System.out.println("Not a month");
        }
        if (dayOfMonth==4){
            System.out.println("The day of the month is the "+dayOfMonth+"th");
        }
            else if (dayOfMonth==1) {
            System.out.println("The day of the month is the " + dayOfMonth + "st");
            }
            else if (dayOfMonth==21) {
                System.out.println("The day of the month is the " + dayOfMonth + "st");
            }
            else if (dayOfMonth==31) {
                System.out.println("The day of the month is the " + dayOfMonth + "st");
            }
            else if (dayOfMonth==2) {
            System.out.println("The day of the month is the " + dayOfMonth + "nd");
            }
            else if (dayOfMonth==22) {
                System.out.println("The day of the month is the " + dayOfMonth + "nd");
            }
            else if (dayOfMonth==3) {
                System.out.println("The day of the month is the " + dayOfMonth + "rd");
            }
            else if (dayOfMonth==23) {
                System.out.println("The day of the month is the " + dayOfMonth + "rd");
            }
            else if (dayOfMonth>10&&dayOfMonth<21) {
            System.out.println("The day of the month is the " + dayOfMonth + "th");
            }
            else if (dayOfMonth>23){
                System.out.println("The day of the month is the " +dayOfMonth+"th");
            }
        else {
            System.out.println(dayOfMonth);
        }
        if (weekday==1) {
            System.out.println("The day of the week is Sunday");
        }
            else if (weekday==2){
                System.out.println("The day of the week is Monday");
            }
            else if (weekday==3){
                System.out.println("The day of the week is Tuesday");
            }
            else if (weekday==4){
                System.out.println("The day of the week is Wednesday");
            }
            else if (weekday==5){
                System.out.println("The day of the week is Thursday");
            }
            else if (weekday==6){
                System.out.println("The day of the week is Friday");
            }
            else if (weekday==7){
                System.out.println("The day of the week is Saturday");
            }
        else {
            System.out.println("Not a weekday");
            }

        // System.out.println("The current date is "+month+"/"+dayOfMonth+"/"+year);
        // System.out.println("The day of the month is "+dayOfMonth);
        // System.out.println("The month is "+month);
        System.out.println("The year is "+year);
        // System.out.println("The weekday is "+weekday);

        myCal.add(Calendar.DAY_OF_MONTH,100);
        int dayOfMonth2 = myCal.get(Calendar.DAY_OF_MONTH);
        int month2 = (myCal.get(Calendar.MONTH)+1);
        int year2 = myCal.get(Calendar.YEAR);
        int weekday2 = myCal.get(Calendar.DAY_OF_WEEK);
        // System.out.println("The date in 100 days is "+month2+"/"+dayOfMonth2+"/"+year2);
        if (month2==1){
            System.out.println("The date in 100 days is January "+dayOfMonth2+", "+year2);
        }
            else if (month2==2) {
                System.out.println("The date in 100 days is February "+dayOfMonth2+", "+year2);
            }
            else if (month2==3) {
                System.out.println("The date in 100 days is March "+dayOfMonth2+", "+year2);
            }
            else if (month2==4) {
                System.out.println("The date in 100 days is April "+dayOfMonth2+", "+year2);
            }
            else if (month2==5) {
                System.out.println("The date in 100 days is May "+dayOfMonth2+", "+year2);
            }
            else if (month2==6) {
                System.out.println("The date in 100 days is June "+dayOfMonth2+", "+year2);
            }
            else if (month2==7) {
                System.out.println("The date in 100 days is July "+dayOfMonth2+", "+year2);
            }
            else if (month2==8) {
                System.out.println("The date in 100 days is August "+dayOfMonth2+", "+year2);
            }
            else if (month2==9) {
                System.out.println("The date in 100 days is September "+dayOfMonth2+", "+year2);
            }
            else if (month2==10) {
                System.out.println("The date in 100 days is October "+dayOfMonth2+", "+year2);
            }
            else if (month2==11) {
                System.out.println("The date in 100 days is November "+dayOfMonth2+", "+year2);
            }
            else if (month2==12) {
                System.out.println("The date in 100 days is December "+dayOfMonth2+", "+year2);
            }
        else {
            System.out.println("Not a month");
        }
        // System.out.println("The day of the week in 100 days is "+weekday2);
        if (weekday2==1) {
            System.out.println("The day of the week in 100 days is Sunday");
        }
            else if (weekday2==2){
                System.out.println("The day of the week in 100 days is Monday");
            }
            else if (weekday2==3){
                System.out.println("The day of the week in 100 days is Tuesday");
            }
            else if (weekday2==4){
                System.out.println("The day of the week in 100 days is Wednesday");
            }
            else if (weekday2==5){
                System.out.println("The day of the week in 100 days is Thursday");
            }
            else if (weekday2==6){
                System.out.println("The day of the week in 100 days is Friday");
            }
            else if (weekday2==7){
                System.out.println("The day of the week in 100 days is Saturday");
            }
        else {
            System.out.println("Not a weekday");
        }

        GregorianCalendar bday = new GregorianCalendar(2003,4,21);
        int dayOfMonth3 = bday.get(Calendar.DAY_OF_MONTH);
        int month3 = bday.get(Calendar.MONTH);
        int weekday3 = bday.get(Calendar.DAY_OF_WEEK);
        // System.out.println("The day of my birthday was "+month3+"/"+dayOfMonth3+"/"+year3);
        if (dayOfMonth3==21 && month3==4){
            System.out.println("The date of my birthday is April 21, 2003");
        }
        else {
            System.out.println("Not my birthday");
        }
        // System.out.println("The weekday of my birthday was "+weekday3);
        if (weekday3==0) {
            System.out.println("The weekday of my birthday was Sunday");
        }
            else if (weekday3==1){
                System.out.println("The weekday of my birthday was Monday");
            }
            else if (weekday3==2){
                System.out.println("The weekday of my birthday was Tuesday");
            }
            else if (weekday3==3){
                System.out.println("The weekday of my birthday was Wednesday");
            }
            else if (weekday3==4){
                System.out.println("The weekday of my birthday was Thursday");
            }
            else if (weekday3==5){
                System.out.println("The weekday of my birthday was Friday");
            }
            else if (weekday3==6){
                System.out.println("The weekday of my birthday was Saturday");
            }
        else{
            System.out.println("Not a weekday");
            }

        bday.add(Calendar.DAY_OF_MONTH,10000);
        int dayOfMonth4 = bday.get(Calendar.DAY_OF_MONTH);
        int month4 = bday.get(Calendar.MONTH);
        int year4 = bday.get(Calendar.YEAR);
        int weekday4 = bday.get(Calendar.DAY_OF_WEEK);
        // System.out.println("10,000 days from my birthday is "+month4+"/"+dayOfMonth4+"/"+year4);
        if (month4==1){
            System.out.println("10,000 days from my birthday is January "+dayOfMonth4+", "+year4);
        }
            else if (month4==2) {
                System.out.println("10,000 days from my birthday is February "+dayOfMonth4+", "+year4);
            }
            else if (month4==3) {
                System.out.println("10,000 days from my birthday is March "+dayOfMonth4+", "+year4);
            }
            else if (month4==4) {
                System.out.println("10,000 days from my birthday is April "+dayOfMonth4+", "+year4);
            }
            else if (month4==5) {
                System.out.println("10,000 days from my birthday is May "+dayOfMonth4+", "+year4);
            }
            else if (month4==6) {
                System.out.println("10,000 days from my birthday is June "+dayOfMonth4+", "+year4);
            }
            else if (month4==7) {
                System.out.println("10,000 days from my birthday is July "+dayOfMonth4+", "+year4);
            }
            else if (month4==8) {
                System.out.println("10,000 days from my birthday is August "+dayOfMonth4+", "+year4);
            }
            else if (month4==9) {
                System.out.println("10,000 days from my birthday is September "+dayOfMonth4+", "+year4);
            }
            else if (month4==10) {
                System.out.println("10,000 days from my birthday is October "+dayOfMonth4+", "+year4);
            }
            else if (month4==11) {
                System.out.println("10,000 days from my birthday is November "+dayOfMonth4+", "+year4);
            }
            else if (month4==12) {
                System.out.println("10,000 days from my birthday is December "+dayOfMonth4+", "+year4);
            }
        else {
            System.out.println("Not a month");
        }
        // System.out.println("The day of the week 10,000 days from my birthday is "+weekday4);
        if (weekday4==0) {
            System.out.println("The day of the week 10,000 days from my birthday is Sunday");
        }
            else if (weekday4==1){
                System.out.println("The day of the week 10,000 days from my birthday is Monday");
            }
            else if (weekday4==2){
                System.out.println("The day of the week 10,000 days from my birthday is Tuesday");
            }
            else if (weekday4==3){
                System.out.println("The day of the week 10,000 days from my birthday is Wednesday");
            }
            else if (weekday4==4){
                System.out.println("The day of the week 10,000 days from my birthday is Thursday");
            }
            else if (weekday4==5){
                System.out.println("The day of the week 10,000 days from my birthday is Friday");
            }
            else if (weekday4==6){
                System.out.println("The day of the week 10,000 days from my birthday is Saturday");
            }
        else{
            System.out.println("Not a weekday");
        }

        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        // System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        // System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)


    }

}