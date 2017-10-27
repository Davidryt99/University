import java.util.Scanner;
public class spoc5 {

public static void main (String [] args) {
	
	int answer = 10;String finalresultstr2 = "";String finalresultstr = ""; int finalresult = 0; int num2 = 0; int den2 = 0; int result = 0;int dencomun = 0;int opnum;int operation = 0; int opposite; int reverse;int sumaden; int restaden; int multden; int divden; int oppositeden; int reverseden;
	Scanner input = new Scanner(System.in);
	System.out.println("Insert the numerator");
	int num =input.nextInt();
	System.out.println("Insert the denominator");
	int den =input.nextInt();
	while(answer>7) {
	System.out.println("Choose the operation you want to perform");
	System.out.println("1 --> ADD");
	System.out.println("2 --> SUBSTRACT");
	System.out.println("3 --> MULTIPLY");
	System.out.println("4 --> DIVIDE");
	System.out.println("5 --> OPPOSITE");
	System.out.println("6 --> REVERSE");
	System.out.println("7 --> EXIT");
	answer =input.nextInt();
	if (answer == 1 || answer == 2 || answer ==3 || answer == 4) {
		System.out.println("Insert the numerator of second fraction");
		num2 =input.nextInt();
		System.out.println("Insert the denominator of the second fraction");
		den2 =input.nextInt();
	}
	switch(answer) {
	case 1: 
	if (den == den2) {
		operation= num + num2;
		dencomun = den;
	}else {
		operation= den2*num + den*num2;
		dencomun = den*den2;
	}
	System.out.println("The result is "+operation+"/"+dencomun);
	break;
	case 2:
		if (den == den2) {
			operation= num - num2;
			dencomun = den;
		}else {
			operation= den2*num - den*num2;
			dencomun = den*den2;
		}
	System.out.println("The result is "+operation+"/"+dencomun);
	break;
	case 3:
	operation = num *num2;
	dencomun = den * den2;
	System.out.println("The result is "+operation+"/"+dencomun);
	break;
	
	case 4:
	operation = num * den2;
	dencomun = den * num2;
	System.out.println("The result is "+operation+"/"+dencomun);
	break;
	
	case 5:
		operation = num * -1;
		dencomun = den;
		System.out.println("The result is "+operation+"/"+dencomun);
		break;
	case 6:
		operation = den;
		dencomun = num;
		System.out.println("The result is "+operation+"/"+dencomun);
		break;
	case 7:
		System.exit(0);
	case 8:
		System.out.println("Error, you have entered an incorrect option");
		
	}}
	if (dencomun == 0 && operation != 0) {
		System.out.println("Especial result. We apply the theory and..");
		finalresultstr = "The result is infinite";
	}
	if (operation == 0 && dencomun != 0) {
		System.out.println("Especial result. We apply the theory and..");
		finalresultstr = "The result is 0";
	}
	if (operation == 0 && dencomun == 0) {
		System.out.println("Especial result. We apply the theory and..");
		finalresultstr = "The result is an indetermination";
	}
	if (dencomun == 1) {
		finalresult = operation;
	}
	if(dencomun == operation) {
		finalresult = 1;
	}
	else {
		for(int i = dencomun;i>1;i--) {
			int value = operation%i;
			int value2 = dencomun%i;
			if(value==0 && value2==0) {
			System.out.println("Reduction possible: We divide the fraction between "+i);
			dencomun=dencomun/i;
			operation = operation/i;
			i= dencomun;
				if (dencomun == 1) {
				finalresult = operation;
				}else {
					
				}
			}else {
			}
    }	
	}
	if (finalresult==0)
		finalresultstr2 ="The result is "+ operation+"/"+dencomun;
	else {
		finalresultstr2 = "The result is "+ finalresult;
	}
	if (finalresultstr.isEmpty()) {
		System.out.println(finalresultstr2);
	}else {
		System.out.println(finalresultstr);
	}
}
}
