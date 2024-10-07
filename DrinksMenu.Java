import java.util.Scanner;
import java.util.ArrayList;
class DrinksMenu {
	
public static void main (String [] args) {
	
ArrayList<String> options = new ArrayList<>();
ArrayList<String> choices = new ArrayList<>();
	
Scanner scan = new Scanner (System.in);

System.out.println("How old are you?");	
String ageInput = scan.nextLine();

int age = Integer.parseInt(ageInput);




if (age < 18) {
	options.add("Milk");
	options.add("Juice");
	options.add("Espresso Mås");
	System.out.println("Customer is underaged");

}else {
	options.add("Isbjørn");
	options.add("Ildbjørn");
	options.add("Wine");
	System.out.println("Customer is " + age + " years old");
}
options.add("Water");
System.out.println("how many beverages?");
int numberOfDrinks = Integer.parseInt(scan.nextLine());

System.out.println("Please choose a beverage");
	for(int i = 0;i<options.size();i++){
            System.out.println(options.get(i));
 }
 while(choices.size()<numberOfDrinks){
	 System.out.println("Please choose a drink");
	 String choice = scan.nextLine();
	 choices.add(choice);
 }
	 
 }
}
