package section8;

public class LazyEvaluationSingleton {

	// the private ref to the one and only instance
	private static LazyEvaluationSingleton uniqueInstance = null;
	
	// an instance attribute
	private int data = 0;
	
	private LazyEvaluationSingleton() {
		
	}
	
	public static LazyEvaluationSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazyEvaluationSingleton();
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
