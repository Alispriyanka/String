public class Reverse
 {
public static void main(String args[])
  {
      String original="malayalam";
       String reverse="";
         for(int i=original.length()-1;i>=0;i--)
    {
     reverse=reverse+original.charAt(i);
}
     if(original.equals(reverse))
      {
System.out.print("palinrome");


}
else
{
System.out.print("Not a polinrome");
}
}


}
