import java.util.Scanner;

class SimpleCalcular
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);

		System.out.println("1 Addition");
		System.out.println("2 Subtrication");
		System.out.println("3 Multipication");
		System.out.println("4 Division");
		System.out.println("5 reminder");

		System.out.println("Enter any Number");
		String v = ob.nextLine();
		int sel = Integer.parseInt(v);

		if(sel == 1)
		{
			System.out.print("Enter 1st value:");
			String v1 = ob.nextLine();
			int a = Integer.parseInt(v1);

			System.out.print("Enter 2nd value");
			String v2 = ob.nextLine();
			int b=Integer.parseInt(v2);

			System.out.println("Addition is:" + (a+b));
		}

			if(sel == 2)
		{
			System.out.print("Enter 1st value:");
			String v1 = ob.nextLine();
			int a = Integer.parseInt(v1);

			System.out.print("Enter 2nd value");
			String v2 = ob.nextLine();
			int b=Integer.parseInt(v2);

			System.out.println("subtrication is:" + (a-b));
		}

			if(sel == 3)
		{
			System.out.print("Enter 1st value:");
			String v1 = ob.nextLine();
			int a = Integer.parseInt(v1);

			System.out.print("Enter 2nd value");
			String v2 = ob.nextLine();
			int b=Integer.parseInt(v2);

			System.out.println("Multipication is:" + (a*b));
		}

			if(sel == 4)
		{
			System.out.print("Enter 1st value:");
			String v1 = ob.nextLine();
			int a = Integer.parseInt(v1);

			System.out.print("Enter 2nd value");
			String v2 = ob.nextLine();
			int b=Integer.parseInt(v2);

			System.out.println("Division is:" + (a/b));
		}

			if(sel == 5)
		{
			System.out.print("Enter 1st value:");
			String v1 = ob.nextLine();
			int a = Integer.parseInt(v1);

			System.out.print("Enter 2nd value");
			String v2 = ob.nextLine();
			int b=Integer.parseInt(v2);

			System.out.println("reminder is:" + (a%b));
		}
	}
}

