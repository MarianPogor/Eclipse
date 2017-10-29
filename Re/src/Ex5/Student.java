package Ex5;

public class Student
{
private String name;
private char M;
private int student_number;


public Student(String name,char M,int student_number)
{
   this.name=name;
   this.M=M;
   this.student_number = student_number;
   
}
public Student(String name , int student_number)
{
   this.name=name;
   this.student_number = 0;
   
}
public void setName(String name)
{
   this.name=name;
}
public void setStudentNumber(int student_number)
{
   this.student_number=student_number;
}

public void setGender(char M)
{
   this.M = M;
}

public int getStudentNumber()
{
   return student_number;
}

public String getName()
{
   return name;
}
public char getGender()
{
   return M;
}

public String toString()
{
   return name + "   "+ student_number +  "  " + M;

}
}
