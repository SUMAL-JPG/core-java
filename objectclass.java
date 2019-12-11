package objectclass;

public class objectclass {
static int Lastroll=100;
int roll_no;
//costructor
objectclass()
{
	roll_no=Lastroll;
	Lastroll++;
}
//overriding hash code()
public int hashcode()
{
	return roll_no;
	
}
//driver code 
public static void main(String[] args)
{
objectclass s= new objectclass();
//Below two statements are equalent
System.out.println(s);
System.out.println(s.toString());
Object obj=new String("Face");
Class c= obj.getClass();
System.out.println("Class of Object obj is:"+c.getName());
s=null;
System.gc();
}
protected void finalize()
{
System.out.println("finalized method class");

	}

}
