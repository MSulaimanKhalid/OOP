import java.util.Scanner;
public class LabTask{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.printf("%50S\n","these are the values without user input" );
		byte b=1;
		short s=123;
		int i=21;
		long l=321123;
		char c='c';
		String str="Full marks de dain SIR!";
		boolean bool=true;
		System.out.printf("value of byte: %d\n",b);
		System.out.printf("value of short: %d\n",s);
		System.out.printf("value of int: %d\n",i);
		System.out.printf("value of long: %d\n",l);
		System.out.printf("value of char: %c\n",c);
		System.out.printf("value of string: %s\n",str);
		System.out.printf("value of boolean: %b\n",bool);
		System.out.printf("%39S\n","give inputs");
		System.out.print("Enter value of byte: ");
		b=input.nextByte();
		System.out.print("Enter value of short: ");
		s=input.nextShort();
		System.out.print("Enter value of integer: ");
		i=input.nextInt();
		System.out.print("Enter value of long: ");
		l=input.nextLong();
		System.out.print("Enter char: ");
		c=input.next().charAt(0);
		System.out.print("Enter string(one word): ");
		str=input.next();
		System.out.print("Enter string(multiple words): ");
		String str1=input1.nextLine();
		System.out.print("Enter a boolean value: ");
		bool=input.nextBoolean();
		System.out.printf("%57S\n","these are the values by taking input from user");
		System.out.printf("value of byte: %d\n",b);
		System.out.printf("value of short: %d\n",s);
		System.out.printf("value of int: %d\n",i);
		System.out.printf("value of long: %d\n",l);
		System.out.printf("value of char: %c\n",c);
		System.out.printf("value of string(one word): %s\n",str);
		System.out.printf("value of string(multiple words): %s\n",str1);
		System.out.printf("value of boolean: %b\n",bool);		
	}
} 