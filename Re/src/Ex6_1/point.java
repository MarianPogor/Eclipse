package Ex6_1;

import javax.swing.Spring;

public class point
{
private int x;
private int y;

public point(int x, int y)
{
   this.x = x;
   this.y = y;
}

public int getX()
{
   return x;
}

public void setX(int x)
{
   this.x = x;
}

public int getY()
{
   return y;
}

public void setY(int y)
{
   this.y = y;
}
public int moveTo(int newX, int newY)
{
   return newX & newY;
}
public int  move(int xDistance, int yDistance)
{
   return x+ xDistance & y+ yDistance;
}
public String toString()
{
   return x + " " +y;
}

}
