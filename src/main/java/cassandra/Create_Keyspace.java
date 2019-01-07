package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Create_Keyspace {

	public static void main(String[] args) {
		//Query
		String query = "CREATE KEYSPACE tp WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};";
		
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect();
		session.execute(query);
		session.execute("USE tp");
		System.out.println("Keyspace created");

	}

}
