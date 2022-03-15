package greater;
import java.util.Scanner;

public class math {
	int n1;
	int n2;
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		n1=s.nextInt();
		System.out.println("enter no 2");
		n2=s.nextInt();
	}
	void show() {
		if(n1>n2)
			System.out.println("n1 is greater ");
			else 
				System.out.println("n2 is greater ");
				
		}
	
	

	public static void main(String[] args) {
	math m=new math();
	m.input();
	m.show();

	}

}
