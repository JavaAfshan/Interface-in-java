/*	public class C1 implements Convertable
	{ 
	private int x;
	public C1(int a) { x = a; }
	public double convert(int j)
	{ return x + j; }
	}
	
*/

//It is correctly implements

 /* 
  * public class C1 implements Convertable
{ 
private int x;
public C1(int a) { x = a; }
public int convert(int i)
{ return i; }
}
 */
 
//It gives an error because the definition of functions that defines in interface is different from functions that overrides here in class C2 because both have different return type so both functions are different for correcting we have two options first we have to make class C2 abstract or second we have change the return type of convert method into double and parameter into double 


/*
  public class C1

{ private int x;
public C1(int a) { x = a; }
public double convert(int i)
{ return (double)x; }
}

 */

//It does not implementing any interface so if we create an object for C3 it works fine.

public class C1
{ 
	private Convertable convertor;
public C1(Convertable c)
{ convertor = c; }
public void printConversion(int x)
{ System.out.println(convertor.convert(x)); }
}



