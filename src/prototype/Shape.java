package prototype;

abstract class Shape implements Cloneable {

	private String id;
	protected String type;
	
	abstract void draw();
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Object clone() {
		Object cloneObject = null;
		try {
			cloneObject = super.clone();
		} catch (CloneNotSupportedException e)  {
			e.printStackTrace();
		}
		
		return cloneObject;
	}
}
