package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class Read_Data {

	public static void main(String[] args) {
		String query = "SELECT * FROM emp;";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tutorialspoint");
		ResultSet result = session.execute(query);
		System.out.println(result.all());

	}

}
