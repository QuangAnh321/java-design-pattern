package principles;

public class Computer {
	
	DisplayModule dm;
	
	public void setDisplayModule(DisplayModule dm) {
		this.dm = dm;
	}
	
	public void display() {
		dm.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		DisplayModule monitor = new Monitor();
		DisplayModule projector = new Projector();
		
		computer.setDisplayModule(monitor);
		computer.display();
		
		computer.setDisplayModule(projector);
		computer.display();
	}

}
