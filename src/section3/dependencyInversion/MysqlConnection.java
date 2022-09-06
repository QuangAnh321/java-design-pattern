package section3.dependencyInversion;

public class MysqlConnection implements DBConnectionInterface {

	@Override
	public int connect() {
		return 1;
	}

}
