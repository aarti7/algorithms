public class explanation_for_static {
// static variable or class is associated with class and not with the objects of that class:
// means that it is one and that is final/constant/fixed/static in behavior
	
	//IMPORTANT
// you can 	call this static variable or class without creating an instance of the outer class (here: explanation_for_static):
// means here an instance of the class 'explanation_for_static' wont need to be created as you will see in the first case
// It'll be needed to be created in the second case!
// FUN FACT: static - Java environment should be able to call main method without creating an instance of the class ,
// so that is why 'main' method must be declared as static.	And as static method can call only static class/object/variables/method, either 1. those 4 things must be declared static or 2. choose second method
	
	public static  class Stuff
	{
	   public static  String naam = "I'm a static variable is"; 
	}
												// can a class be made static??? ||| ABOVE I DID
												// declaring a class makes all its methods and variables also static? ||| SEEMS LIKE IT
	public static void main(String[] args)
	{
			System.out.println(Stuff.naam);
	}

	// Following code is IN CASE YOU DONT MAKE THE CLASS 'Stuff' as a Static class
/*	public class Stuff
	{
	   public String naam = "I'm a static variable is"; 
	}
	public static void main(String[] args)
	{
			explanation_for_static p = new explanation_for_static();
			Stuff s = p.new Stuff();
			// can also update 'naam' here
			s.naam = "aarti";
			System.out.println(s.naam);
	}
*/
}
