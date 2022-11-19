package section9.challenge;

import java.util.ArrayList;

public class NormalMeal  extends Meal {
	
	private ArrayList<Item> itemList;
	
	public NormalMeal() { 
		itemList = new ArrayList<Item>();
	}
	
	@Override
	public void addItems(Item item) {
		if (item instanceof ChickenBurger || item instanceof ColdDrink) {
			itemList.add(item);
		} else {
			System.out.println("Item: "+item.getName()+"cannot be use for Normal Meal");
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
		System.out.println("Normal Meal");
		for (int i = 0; i < itemList.size(); i++) {
			Item item = itemList.get(i);
			System.out.println("Item: "+item.getName()+", Packing: "+item.pack()+", Price: "+item.getPrice());
		}
		System.out.println("Total Cost: "+this.getCost());
	}

}
 