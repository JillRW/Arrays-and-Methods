package week4codingassignment;

public class week04codingsteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 3 };
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		System.out.println(ages[ages.length -1] - ages[0]);
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int total = 0;
		for(int age : ages) {
			total += age;
		}
		double median = total/ ages.length;
		System.out.println(median);
		
		
	//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	  //a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	    int theTotal = 0;
	    
	    for(String name : names) {
	    	theTotal += name.length();
	    }
	    	int ave = theTotal/names.length;
	    
	    	System.out.println(ave);
	    
	    

	    
	    //b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
       String result = "";
       for (int i = 0; i < names.length; i ++) {
    	   result += names[i] + " ";
       }
    	   System.out.println(result);
       
	    

 //3.	How do you access the last element of any array?
        //names[names.length-1];
 //4.	How do you access the first element of any array?
       //names[0]
 //5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
       int[]nameLengths = new int [names.length];
       for(int i = 0; i < names.length; i++) {
    	   nameLengths[i] = names[i].length();
       }
       for (int i = 0; i < nameLengths.length; i++) {
       
       System.out.println(nameLengths[i]);
       }
	
	
 //6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
       int lengthsTotal = 0;
       for (int i = 0; i < nameLengths.length; i++) {
    	lengthsTotal += nameLengths[i];
    }
    	System.out.println(lengthsTotal);
	}	
  //7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String addWord(String word, int n) {
		String newString = "";
		for(int i = 0; i < n; i ++) {
			newString += word;
		}
		return newString;
	}
  //8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String getFullName(String firstName, String lastName) {
		
	
	return firstName + " " + lastName;
	}
  //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sumOfInts(int[] array) {
		int totalInts = 0;
		for(int num: array) {
			totalInts += num;
			if (totalInts > 100);
		}
			return true;
	}
  //10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double createAverageOfElements(double[] doubleArray) {
		double doubleTotal = 0;
		for (double number: doubleArray) {
			doubleTotal += number;
			
		}
		return doubleTotal/doubleArray.length;
	}
   //11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean averageOfElements(double[] firstArray, double[] secondArray) {
		double totalFirstArray = 0;
		for(double dble: firstArray) {
			totalFirstArray += dble;
		}
		double totalSecondArray = 0;
		for( double number: secondArray) {
			totalSecondArray += number;
		}
		  if(totalFirstArray/firstArray.length > totalSecondArray/secondArray.length);
		
	    return true;
}
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
	}
	return true;
	}
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static boolean willBuyCoffee(boolean isDaytime, int levelOfExhaustion) {
		if(isDaytime == true && levelOfExhaustion > 5) {
	}
		return true;
}
}
		
	
	

	

	
	




    
      
       
	

       
       

       


	    
	    

	

