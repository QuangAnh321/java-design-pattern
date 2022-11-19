package section8;

public class SynchronizedSingleton {

	// the private ref to the one and only instance
	private static SynchronizedSingleton uniqueInstance = null;
	
	// an instance attribute
	private int data = 0;
	
	private SynchronizedSingleton() {
		
	}
	
	// synchronized keyword force every thread to wait
	// for its turn to enter the method
	public static synchronized SynchronizedSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SynchronizedSingleton();
		}
		
		return uniqueInstance;
	}
	
	public void setData(int myData) {
		data = myData;
	}
	
	public int getData() {
		return data;
	}
}
