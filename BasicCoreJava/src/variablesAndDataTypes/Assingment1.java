package variablesAndDataTypes;

public class Assingment1 {

	public static void main(String[] args) {
int a =10;
int b =20;
int c;
//with third variable swapping
/*c=a;
a=b;
b=c;

System.out.println("value of b = "+b);

System.out.println("value of a = "+a); */
	
//without third variable swapping

a=a+b;
b=a-b;
a=a-b;

System.out.println("value of b = "+b);

System.out.println("value of a = "+a);
System.out.println(a>b);

	}
}
