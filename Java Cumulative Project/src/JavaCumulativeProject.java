import java.util.Scanner;

public class JavaCumulativeProject
{
	    static String name;
		public static void main(String[] args)
		{
			greetPlayer();
			askChoices();
		}
		public static void greetPlayer()
		       {
		    	Scanner userInput =new Scanner (System.in);  
		        System.out.println("Greetings player! What is your name?");
		    	name = userInput.nextLine();
		    	int randomNumber1 = (int)(Math.random()*5);
		    	String [] compliment = {" I like your face!"," I like your socks!"," I like your shirt!"," I like your style!"," that is a nice name!"};
		    	int compliment1 = randomNumber1;
		    	System.out.println("Hello " + name + "," + compliment[compliment1]);
				System.out.println("Please enjoy!");  
		       }
		public static void askChoices()
		       {
		    	Scanner userInput =new Scanner (System.in);  
			    System.out.println("How many things are you deciding between?");
			    int choice = userInput.nextInt();
			    String [] choiceArray = new String [choice];
			    int option = 1;
			    for (int i = 0; i < choiceArray.length; i++)
			    	{
			    	  if (i < choiceArray.length)
			    		  {
			    		  System.out.println("Tell me option number " + option + ".");
				    	  Scanner userInput2 = new Scanner (System.in);
				    	  choiceArray[i] = userInput2.nextLine();	
				    	  option++;
			    		  }
			    	}
			    int randomNumber2 = (int)(Math.random()*choiceArray.length)+1;
			    System.out.println(name + ", my gut tells me that you should go with " + choiceArray[randomNumber2] + ".");
		       }
}
