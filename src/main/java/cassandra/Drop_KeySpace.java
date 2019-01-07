package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Drop_KeySpace {

	public static void main(String[] args) {
		String query = "DROP KEYSPACE tp;";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect();
		session.execute(query);
		System.out.println("Keyspace deleted");

	}

}
