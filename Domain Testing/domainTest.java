import java.util.Scanner;

public class domainTest {
    private static Scanner s = new Scanner(System.in);
    private static String Poetry = "Child can participate in Poetry";
    private static String Essay = "Child can participate in Essay Writing";
    private static String Draw = "Child can participate in Drawing";
    private static String Rhyme = "Child can participate in Rhyme";
    private static String Quiz = "Child can participate in Quiz";
    private static String Story = "Child can participate in Story Telling";

    public static void main(String args[]){
        int answer = 0;
        
        do {
            //Taking user input
            System.out.println("Is the child a boy or girl? (Boy: 0/ Girl: 1)");
            int gender = s.nextInt();
            
            System.out.println("How old is the child?");
            int age = s.nextInt();

            //Checking age
            if (age <= 0) {
                System.out.println("Please enter a valid age.");
            } 
            
            
            else if (gender == 0)
            {  //BOY
            	if (age > 20) 
            		System.out.println(Poetry);
            	else if (age > 11 && age < 15) 
            		System.out.println(Quiz);
            	else if (age > 7 && age < 10) 
            		System.out.println(Story);
            	else if(age<6) 
            		System.out.println(Rhyme);
            	else
            		System.out.println("Invalid Age Input! Child cannot participate");                
            } 
            
            else if (gender == 1)
            { //GIRL
            	if (age > 20) 
            		System.out.println(Poetry);
            	else if (age > 10 && age < 15) 
            		System.out.println(Essay);
            	else if (age > 7 && age < 10) 
            		System.out.println(Draw);
            	else if (age > 20) 
            		System.out.println(Poetry);
            	else if (age < 6)
            		System.out.println(Rhyme);
            	else
            		System.out.println("Invalid Age Input! Child cannot participate");
            }
            
            else 
            	System.out.println("Invalid Gender Input");

            System.out.println("Want to get another ticket? (No: 0/ Yes: 1)");
            answer = s.nextInt();

        } while (answer != 0);
        
            System.out.println("Thank you!");
        
    }
}


