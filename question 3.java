package q2;
import java.util.Scanner;
public class emp {
	String name;
	int age;
	float salary;
	Scanner s;
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter age");
		age=s.nextInt();
		System.out.println("Enter Salary");
		salary=s.nextFloat();
}
     void show()
{
	System.out.println(name + " " + age + " " +salary);
}
	public static void main(String[] args) {
		
		emp e=new emp();
		e.input();
		e.show();
	}

}
