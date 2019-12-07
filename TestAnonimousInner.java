package Anonimous;
abstract class Person
{
	abstract void learn();
}
public class TestAnonimousInner {

	public static void main(String[] args) {
		 Person p=new Person()
				 {
			 void learn()
			 {
				 System.out.println("welcome.");
			 }
				 };
p.learn();
	}

}
