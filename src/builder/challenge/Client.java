package builder.challenge;

public class Client {

	public static void main(String[] args) {
		MealDirector director = new MealDirector();
		
		MealBuilder normalMealBuilder = new NormalMealBuilder();
		MealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
		
		ColdDrink coke = new Coke();
		ColdDrink pepsi = new Pepsi();
		
		director.createMeal(vegetarianMealBuilder, coke);
		System.out.println();
		director.createMeal(normalMealBuilder, pepsi);
	}
}
