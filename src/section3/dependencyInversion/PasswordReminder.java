package section3.dependencyInversion;

public class PasswordReminder {

	private DBConnectionInterface dbConnection;
	
	/**
	 *  This violate following principles: 
	 *  - dependency inversion
	 *  - open closed
	 * @param connection 
	 */
//	public PasswordReminder(MysqlConnectiondb connection) {
//		this.dbConnection = dbConnection;
//	}
	
	// Follow dependency inversion and open closed principles
	public PasswordReminder(DBConnectionInterface dbConnection) {
		this.dbConnection = dbConnection;
	}
}
