package Ex3;

import java.util.Scanner;

public class payroll
{
private String name; 
private double hoursworked;

private double priceperhour;

public payroll(String name, double hoursworked, double priceperhour)
{ 
  this.name = name;
  this.hoursworked= hoursworked;
  this.priceperhour = priceperhour;
   
}

public String getName()
{
   return name;
}

public void setName(String name)
{
   this.name = name;
}

public double getHoursworked()
{
   return hoursworked;
}

public void setHoursworked(double hoursworked)
{
   this.hoursworked = hoursworked;
}

public double getPriceperhour()
{
   return priceperhour;
}

public void setPriceperhour(double priceperhour)
{
   this.priceperhour = priceperhour;
}

public String toString()
{   
   return " priceperhour " + priceperhour +"hoursworked :"+ hoursworked; 
}
public int grosspay()
{
   int salary = (int) (priceperhour *hoursworked);
   
   return salary;
}
}
