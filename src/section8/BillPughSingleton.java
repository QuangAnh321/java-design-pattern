package section8;

public class BillPughSingleton {

		// an instance attribute
		private int data = 0;
		
		private BillPughSingleton() {
			
		}
		
		private static class SingletonHelper {
			// Nested class is referenced after getInstance() is called
			private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
		}
		
		public static BillPughSingleton getInstance() {
			return SingletonHelper.uniqueInstance;
		}
		
		public void setData(int myData) {
			data = myData;
		}
		
		public int getData() {
			return data;
		}
}
