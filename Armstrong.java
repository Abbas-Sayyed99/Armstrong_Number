import java.util.*;

class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int rem, sum = 0;

		System.out.print("\n\t\t\tEnter 3 digit number : ");
			int n = sc.nextInt();
		System.out.println("\n\t\t\t===========================");

		int i = n;

		while(i!=0)
		{
			rem = i%10;

			sum = sum + (rem*rem*rem);

			i=i/10;	
		}

		if(n==sum)
			System.out.println("\n\t\t\tEntered number is an Armstrong number");

		else
			System.out.println("\n\t\t\tEntered number is not an Armstrong number");
	}
}