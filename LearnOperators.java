package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {

		//Operators
		//Assignment operator
		//Arithmetic operator
		//Comparison operator
		//logical operator
		//increment or decrement operator
		
		//Assignment operator(=)
		
		int number=7;
		String name="sara and daksha and Ayra";
		
		//Arithmetic operator ( add, sub, division,mul,model)
		
		//Add +
		
		int a=3;
		int b=4;
		//int c=a+b;
		System.out.println(a+b);
		
		//sub
		System.out.println(a-b);
		
		//mul(*)
		System.out.println(a*b);
		
		//div(/)
		//to get Quotient(/) -div operator
		//to get remainder(%) - model operator
		
		System.out.println(a/b);
		System.out.println(a%b);
		//comparison operator
		//boolean
		//conditions satisfied -true
		//conditions satisfied -false
		//equalTo==
		//notEqualTo !=
		//lessThan <
		//greaterThan >
		//greaterThanOrEqualTo >=
		//lessThanOrEqualTo <=
		
		//equalTo
		
		int c=3;
		int d=5;
		System.out.println(c==d);
		
		//notEqualTo
		System.out.println(c!=d);
		
		//lessThan <
		
		System.out.println(c<d);
		
		//greaterThan >
		
		System.out.println(c>d);
		
		//lessThanEqualTo <=
		System.out.println(c<=d);
		
		//greaterThanEqualto >=
		System.out.println(c>=d);
		System.out.println("----------------------");
		
		//Logical operator 2 condition 
		//And-> &&condition1 and condition2 -should satisfied -then will return true 
		//or-> || either condition2=1 or 2-> then result with true 
		
		//And 
		
		int s=4;
		int r=5;
		System.out.println(s<r&&s==r);
		System.out.println(s<r&&s<=r);
		
		//Or 
		
		System.out.println(s<r||s==r);
		
		System.out.println("------------------");
		//Increment ->preIncrement, postincrement 
		
		int p=4;
		//postIncrement 
		System.out.println(p++); //Increase the number by 1 next iteration 
		
		System.out.println(p);
		
		//preIncrement 
		
		System.out.println(++p);
		
		//decrement 
	int k=9;
	//postdecrement
	System.out.println(k--);
	System.out.println(k);
	//predecrement 
	System.out.println(--k);
	
		
		
		
	}

}
