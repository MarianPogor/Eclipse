package Ex3;

import java.util.Calendar;

public class myDate
{

   private int day;
   private int month;
   private int year;

   public myDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;

   }

   public int getDay()
   {
      return day;
   }

   public void setDay(int day)
   {
      this.day = day;
   }

   public int getMonth()
   {
      return month;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public int getYear()
   {
      return year;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public String displayDate()
   {
      return getDay() + "  " + getMonth() + "  " + getYear();
   }

   public static int daysInMonth(int month)
   {
      if (month == 1)
      {
         return 31;
      }
      else if (month == 2)
      {
         return 28;
      }
      else if (month == 3)
      {
         return 31;
      }
      else if (month == 4)
      {
         return 30;
      }
      else if (month == 5)
      {
         return 31;
      }
      else if (month == 6)
      {
         return 30;
      }
      else if (month == 7)
      {
         return 31;
      }
      else if (month == 8)
      {
         return 31;
      }
      else if (month == 9)
      {
         return 30;
      }
      else if (month == 10)
      {
         return 31;
      }

      else if (month == 11)
      {
         return 30;
      }
      else if (month == 12)
      {
         return 31;
      }
      return 0;
   }

   public String getAstroSign(int month, int day)
   {
      if ((month == 11) && (day >= 22) || (month == 0) && (day <= 19))
      {

         System.out.println("Capricorn");

      }
      else if ((month == 0) && (day >= 20) || (month == 1) && (day <= 18))
      {

         System.out.println("Aquarius");

      }
      else if ((month == 1) && (day >= 19) || (month == 2) && (day <= 20))
      {

         System.out.println("Pisces");

      }
      else if ((month == 2) && (day >= 21) || (month == 3) && (day <= 19))
      {

         System.out.println("Aries");

      }
      else if ((month == 3) && (day >= 20) || (month == 4) && (day <= 20))
      {

         System.out.println("Taurus");

      }
      else if ((month == 4) && (day >= 21) || (month == 5) && (day <= 20))
      {

         System.out.println("Gemini");

      }
      else if ((month == 5) && (day >= 21) || (month == 6) && (day <= 22))
      {

         System.out.println("Cancer");

      }
      else if ((month == 6) && (day >= 23) || (month == 7) && (day <= 22))
      {

         System.out.println("Leo");

      }
      else if ((month == 7) && (day >= 23) || (month == 8) && (day <= 21))
      {

         System.out.println("Virgo");

      }
      else if ((month == 8) && (day >= 22) || (month == 9) && (day <= 21))
      {

         System.out.println("Libra");

      }
      else if ((month == 9) && (day >= 24) || (month == 10) && (day <= 22))
      {

         System.out.println("Scorpio");

      }
      else if ((month == 10) && (day >= 23) || (month == 11) && (day <= 21))
      {

         System.out.println("Sagittarius");

      }

      return " ";
   }

   public int getDayOfWeek()
   {
      Calendar c = Calendar.getInstance();
      c.getTime();
      int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

      return dayOfWeek;
   }

   public  String getMonthName()
   {
     
      
      switch (month)
      {
         case 1:
            System.out.println("January");
            break;
         case 2:
            System.out.println("February");
            break;
         case 3:
            System.out.println("March");
            break;
         case 4:
            System.out.println("April");
            break;
         case 5:
            System.out.println("May");
            break;
         case 6:
            System.out.println("June");
            break;
         case 7:
            System.out.println("July");
            break;
         case 8:
            System.out.println("August");
            break;
         case 9:
            System.out.println("September");
            break;
         case 10:
            System.out.println("Octomber");
            break;
         case 11:
            System.out.println("November");
            break;
         case 12:
            System.out.println("December");
            break;
         default:
            System.out.println("Error");
      
      
   }
      return "  ";
     
   }
}