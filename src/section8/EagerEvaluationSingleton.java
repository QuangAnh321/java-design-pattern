package section8;

public class EagerEvaluationSingleton {

	private static EagerEvaluationSingleton uniqueInstance = new EagerEvaluationSingleton();
	
	private EagerEvaluationSingleton() {
		
	}
	
	public static EagerEvaluationSingleton getInstance() {
		return uniqueInstance;
	}
}
