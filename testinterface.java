
public class testinterface {
public static void main(String args[])
{
Interface1 i=new testingclass1();
i.callback(23);

testingclass2 t2=new testingclass2();
i=t2;
i.callback(23);

t2.number(23);

}
}
