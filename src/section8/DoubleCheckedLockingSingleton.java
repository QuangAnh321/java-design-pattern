package section8;

public class DoubleCheckedLockingSingleton {

	// the private ref to the one and only instance
		private volatile static DoubleCheckedLockingSingleton uniqueInstance = null;
		
		// an instance attribute
		private int data = 0;
		
		private DoubleCheckedLockingSingleton() {
			
		}
		
		public static DoubleCheckedLockingSingleton getInstance() {
			if (uniqueInstance == null) {
				// only synchronize the first time
				synchronized (DoubleCheckedLockingSingleton.class) {
					if (uniqueInstance == null) {
						uniqueInstance = new DoubleCheckedLockingSingleton();
					}
				}
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
