
import java.util.Date;
public class Service
{
   
 int mileage; 
 Date date ;

 

public Service ( int mileage , Date date)
{
   this.mileage=mileage; 
   this.date=date;
   
   
   
   
}
public int getMileage()
{
   return mileage; 
   
}

public Date getDate()
{
   return date;
}



public boolean equals(Object obj )
{
   if (!(obj instanceof Service)) 
      return false;     
         
      Service other =(Service) obj ; 
      
      return mileage==other.mileage
                                   &&date==other.date ; 
      
}
       
public String toString()
{
   return mileage + " ," + date; 
   
}

Service other =(Service) obj; 

return  mileage ==other.mileage && date==other.date;


}


