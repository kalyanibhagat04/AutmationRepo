package ifElseStatements;

public class NestedIfStatements {

	public static void main(String[] args) {

		int a =40;
		int b =70;
		int c =30;
		
		if (a>b)
		{
			if(a>c)
		{
			System.out.println("a is the greatest");
		}
			else 
			{
				System.out.println("c is the greatest");
					}
	}
		else if (b>c)
	{
			System.out.println("B is the greatest");
}
	else 
	{
System.out.println("C is the greatest");
}
}
}
