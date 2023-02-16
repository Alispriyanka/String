public class Polo1
{
public static void main(String[]args)
{
String name="malayalam";
String b="";
for(int i=name.length()-1;i>=0;i--)
{
b=b+name.charAt(i);

}
if(name.equals(b))
{
System.out.println("POLINDROM");

}
else
{
System.out.println("NOT A POLINDROM");
}
}

}
