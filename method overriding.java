class human
{

    public void job()
    {
        System.out.println("working pro");
    }
}
class teacher extends human
{
    public void job()
    {
        System.out.println("Teacher");
    }
}
class doctor extends human
{
    public void job()
    {
        System.out.println("Doctor");
    }
}
public class main
{
    public static void main (String[]args)
    {
        human h1=new human();
        teacher t1=new teacher();
        doctor d1=new doctor();
        human h2=new doctor();
        h1.job();
        t1.job();
        d1.job();
        h2.job();
    }
}