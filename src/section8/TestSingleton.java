package section8;

public class TestSingleton {

	public static void main(String[] args) {
		LazyEvaluationSingleton lazyEval = LazyEvaluationSingleton.getInstance();
		
		lazyEval.setData(30);
		
		System.out.println("First reference: " + lazyEval);
		System.out.println("Singleton data value is: "+ lazyEval.getData());
		
		lazyEval = null;
		lazyEval = LazyEvaluationSingleton.getInstance();
		
		System.out.println("Second reference: " + lazyEval);
		System.out.println("Singleton data value is: "+ lazyEval.getData());
	}

}
