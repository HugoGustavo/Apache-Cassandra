package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Create_Index {

	public static void main(String[] args) {
		String query = "CREATE INDEX name ON emp1 ( emp_name );";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tp");
		session.execute(query);
		System.out.println("Index created");

	}

}
