package section10.challenge;

import java.util.Hashtable;

public class BasicCarCache {

	private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<String, BasicCar>();
	
	public static BasicCar getBasicCar(String basicCarId) {
		BasicCar cachedBasicCar = basicCarMap.get(basicCarId);
		return (BasicCar) cachedBasicCar.clone();
	}
	
	public static void loadCache() {
		Ford ford = new Ford("Ford Ranger", 1000.0);
		ford.setId("1");
		basicCarMap.put(ford.getId(), ford);
		
		Nano nano = new Nano("Nano something", 500.0);
		nano.setId("2");
		basicCarMap.put(nano.getId(), nano);
	}
}
