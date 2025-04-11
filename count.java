//WAP IN JAVA TO INPUT THE STRIBG AND COUNT THE NUMBER OF VOWEL AND CONSONANT
import java.util.Scanner;
class count
{
    public static void main(String args [])
    {
Scanner s=new Scanner(System.in);
System.out.println("enter the character");
String Str =s.nextLine();
int count=0;
int num=0;
for (int i=0;i<Str.length();i++)
{
    char ch=Str.charAt(i);
    if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
    {
        count++;
    }
    else{
        num++;
    }
}
System.out.println("there are " + "  " +count + "vowels and "+ " " +num+"consonants");
}}