import java.util.Scanner;
/*
* @Author Emircan Aktaş - 22.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        /*
        Aries Zodiac Sign: March 21 - April 20

        Taurus Zodiac Sign: April 21 - May 21

        Gemini Zodiac Sign: May 22 - June 22

        Cancer Zodiac Sign: June 23 - July 22

        Leo Zodiac Sign: July 23 - August 22

        Virgo Zodiac Sign: August 23 - September 22

        Libra Zodiac Sign: September 23 - October 22

        Scorpio Zodiac Sign: October 23 - November 21

        Sagittarius Zodiac Sign: November 22 - December 21

        Capricorn Zodiac Sign: December 22 - January 21

        Aquarius Zodiac Sign: January 22 - February 19

        Pisces Zodiac Sign: February 20 - March 20
        */

        Scanner inp = new Scanner(System.in);
        int month,day;
        String operation;
        System.out.println("************************");
        System.out.println("Month list :\n" +
                "1-Jan\n" +
                "2-Feb\n" +
                "3-Mar\n" +
                "4-Apr\n" +
                "5-May\n" +
                "6-Jun\n" +
                "7-Jul\n" +
                "8-Aug\n" +
                "9-Sep\n" +
                "10-Oct\n" +
                "11-Nov\n" +
                "12-Dec");
        System.out.println("************************");
        System.out.println("Choose a month :");
        month = inp.nextInt();
        System.out.println("Choose a day :");
        day = inp.nextInt();

        if (month == 1){
            if (day >=1 && day <= 21){
                System.out.println(day + "/"+ "Jan" + ":"+" Capricorn");
            } else if (day >= 22 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Aquarius");
            }
        }else if (month == 2){
            if (day >=1 && day <= 19){
                System.out.println(day + "/"+ "Jan" + ":"+" Aquarius");
            } else if (day >= 20 && day <=28) {
                System.out.println(day + "/"+ "Jan" + ":"+" Pisces");
            }
        }else if (month == 3){
            if (day >=1 && day <= 20){
                System.out.println(day + "/"+ "Jan" + ":"+" Pisces");
            } else if (day >= 21 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Aries");
            }
        }else if (month == 4){
            if (day >=1 && day <= 20){
                System.out.println(day + "/"+ "Jan" + ":"+" Aries");
            } else if (day >= 21 && day <=30) {
                System.out.println(day + "/"+ "Jan" + ":"+" Taurus");
            }
        }else if (month == 5){
            if (day >=1 && day <= 21){
                System.out.println(day + "/"+ "Jan" + ":"+" Taurus");
            } else if (day >= 22 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Gemini");
            }
        }else if (month == 6){
            if (day >=1 && day <= 22){
                System.out.println(day + "/"+ "Jan" + ":"+" Gemini");
            } else if (day >= 23 && day <=30) {
                System.out.println(day + "/"+ "Jan" + ":"+" Cancer");
            }
        }else if (month == 7){
            if (day >=1 && day <= 22){
                System.out.println(day + "/"+ "Jan" + ":"+" Cancer");
            } else if (day >= 23 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Leo");
            }
        }else if (month == 8){
            if (day >=1 && day <= 22){
                System.out.println(day + "/"+ "Jan" + ":"+" Leo");
            } else if (day >= 23 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Virgo");
            }
        }else if (month == 9){
            if (day >=1 && day <= 22){
                System.out.println(day + "/"+ "Jan" + ":"+" Virgo");
            } else if (day >= 23 && day <=30) {
                System.out.println(day + "/"+ "Jan" + ":"+" Libra");
            }
        }else if (month == 10){
            if (day >=1 && day <= 22){
                System.out.println(day + "/"+ "Jan" + ":"+" Libra");
            } else if (day >= 23 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Scorpio");
            }
        }else if (month == 11){
            if (day >=1 && day <= 21){
                System.out.println(day + "/"+ "Jan" + ":"+" Scorpio");
            } else if (day >= 22 && day <=30) {
                System.out.println(day + "/"+ "Jan" + ":"+" Sagittarius");
            }
        }else if (month == 12){
            if (day >=1 && day <= 21){
                System.out.println(day + "/"+ "Jan" + ":"+" Sagittarius");
            } else if (day >= 22 && day <=31) {
                System.out.println(day + "/"+ "Jan" + ":"+" Capricorn");
            }
        }



    }
}