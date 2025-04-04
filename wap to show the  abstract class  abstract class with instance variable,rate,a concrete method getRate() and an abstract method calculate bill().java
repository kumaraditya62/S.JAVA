abstract class plan
{ 
protected double rate;
public abstract void getRate();
public void calculate(int units)
{
System.out.println("Bill amount for"+units+"units:");
System.out.println(rate*units);
}
}
class commercial_plan extends plan
{
public void getRate()
{
    rate=5.00;
}
}
class domestic_plan extends plan
{
public void getRate()
{
rate=2.50;
}
}
class calculate{
public static void main (String args[])
{
    plan p;
    System.out.println("commercial connection ");
p=new commercial_plan();
    p.getRate();
    p.calculate(250);
    System.out.println("domestic bill connection");
  p=new domestic_plan();
    p.getRate();
    p.calculate(150);
}
}