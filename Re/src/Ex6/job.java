package Ex6;

import Ex3.person;

public class job
{
private String title; 

private double salary;

private person employee;

public job( String title, double salary ,person employee)
{
   this.title=title;
   this.salary = salary;
   this.employee = employee;
   
}
public job(String title , double salary)
{
   employee = null;
   this.title = title;
   this.salary = salary;
   
}
public String getTitle()
{
   return title;
}
public void setTitle(String title)
{
   this.title = title;
}
public double getSalary()
{
   return salary;
}
public void setSalary(double salary)
{
   this.salary = salary;
}
public person getEmployee()
{
   return employee;
}
public void setEmployee(person employee)
{
   this.employee = employee;
}
public double  givePercentageRaise()
{  
   return (salary/100)*20;
}

}
