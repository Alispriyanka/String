class customer
{
String name;
long aadhar;
public static void main(String[]args)
{
customer cst1=new customer();
cst1.name="abcd";
cst1.aadhar=1234;
Bank b=new Bank();
b.createaccount(cst1);


}



}
