
public class MainClass {
public static void  main(String args[])
{
/*
 Convertable c=new C1(23);
 System.out.println("The answer is "+c.convert(34));
 */

	/*
	 C1 c=new C1(23);
	 System.out.println("The answer is "+c.convert(34));
	 	 */
	Convertable CS=new C2(23);
	 C1 c=new C1(CS);
	 c.printConversion(32);
	 

}
}
