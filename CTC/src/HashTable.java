import java.util.HashMap;


public class HashTable
{
	public class Student
	{
		String name;
		int age;
		int grade;
		public Student(String n, int a, int g)
		{
			name = n;
			age = a;
			grade = g;
		}
	}
	public HashMap<Integer, Student> buildmymap (Student[] s)
	{
		HashMap<Integer,Student> mymap= new HashMap <Integer,Student>();
		for (Student k: s)
			mymap.put(k.age, k);
		return mymap;
		
	}
	public static void main(String[] args)
	{
		HashTable thefunc = new HashTable();
		Student[] arrayofstudent = new Student[2];
		arrayofstudent[0] = thefunc. new Student( "Aarti", 28, 3);
		arrayofstudent[1] = thefunc. new Student( "Harish", 18, 4);
		HashMap kk= thefunc.buildmymap(arrayofstudent);
		Student x = (Student) kk.get(18); // Typecasting : to get obejct to match to the holding variable
		System.out.println(x.name);
		
	}
	
}
