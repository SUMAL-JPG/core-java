package Innerclass;

 class outerclass {
	class MethodInner
	{
	public void displayInner()
		{
			System.out.println("This is method inner class");
		}
	
		}
public static void main(String args[])
{
	outerclass Outer=new outerclass();
	outerclass.MethodInner obj=Outer.new MethodInner();
	obj.displayInner();
}}