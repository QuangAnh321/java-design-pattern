package builder.challenge;

import java.util.ArrayList;

public class VegetarianMeal extends Meal {
	
	private ArrayList<Item> itemList;
	
	public VegetarianMeal() {
		itemList = new ArrayList<Item>();	
	}

	@Override
	public void addItems(Item item) {
		if (item instanceof VegetarianBurger || item instanceof ColdDrink) {
			itemList.add(item);
		} else {
			System.out.println("Item: "+item.getName()+"can not be use for Vegetarian Meal");
		}
	}

	@Override
	public int getCost() {
		if (itemList.isEmpty()) {
			return 0;
		} else {
			int cost = 0;
			for (int i = 0; i < itemList.size(); i ++) {
				cost += itemList.get(i).getPrice();
			}
			return cost;
		}
	}

	@Override
	public void showItems() {
		System.out.println("Vegetarian Meal");
		for (int i = 0; i < itemList.size(); i++) {
			Item item = itemList.get(i);
			System.out.println("Item: "+item.getName()+", Packing: "+item.pack()+", Price: "+item.getPrice());
		}
		System.out.println("Total Cost: "+this.getCost());
	}

}
