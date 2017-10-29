package Ex9_03_Clock;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class clock
{
   private int h;
   private int min;
   private int sec;

   public clock(int h, int min, int sec)
   {
      this.h = h;
      this.min = min;
      this.sec = sec;
   }

   public int getTotalTimeInSec(int timeInSec)
   {
     
      int timeInSec1 =  (h*3600)+(min*60)+sec;

      return timeInSec1;

   }

   public int getH()
   {
      return h;
   }

   public void set(int h,int min,int sec)
   {
      this.h = h;
      this.min=min;
      this.sec= sec;
   }

   public int getMin()
   {
      return min;
   }

  

   public int getSec()
   {
      return sec;
   }

   
   public void tic()
   {
      this.sec += 1;
      //add overflow to minutes from seconds
      this.min +=(int)(this.sec/60);
      //update seconds 
      this.sec = this.sec % 60;
      //add overflow to minutes from seconds
      this.h +=(int)(this.min/60);
      //update minutes
      this.min = this.min % 60;
      //adjust hours
      this.h = this.h %24;
     
    
     
   }
   
   public  void convertToSec()
   {
      this.h=3600+h;
      this.min=60*min;
      this.sec=sec;
   }
   
   public boolean isBefore(clock time)
   {
      
      if(h<=23 &&min <=59 &&sec <=59)
      {
         return true;
      }
      return false;
   }
  
   public int timeInSeconds(clock time)
   {
      System.out.println(h*3600 + ":" + min*60+ ":"+sec );
      
      return 0;
   }
   
   
  public   clock timeTo(clock time)
  {  
    //  System.out.println( h+ ":"+ min +":"+ sec);
     clock temp = new clock(h,min,sec);
     
     return temp;
     
  }
  public String toString()
  {
     return  h+ ":"+ min +":"+ sec;
  }
   
   

}
