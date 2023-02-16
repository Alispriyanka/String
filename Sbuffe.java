public class Sbuffe
 {
public static void main(String args[])
   {
long startTime=System.currentTimeMillis();
StringBuffer sb=new StringBuffer("java");
for(int  i=1;i<1000000;i++)
      {
        sb.append("pro");


}

long endTime=System.currentTimeMillis();
System.out.println(endTime-startTime+"ms");
} 




}
