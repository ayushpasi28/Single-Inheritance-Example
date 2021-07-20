package Practice;
class Animal{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking.....");
	}
}

public class TestInheritance {
	public static void main(String args[])
	{
	Dog obj=new Dog();
	obj.eat();
	obj.bark();
	}

}
