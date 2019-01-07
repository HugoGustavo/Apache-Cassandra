package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Alter_Keyspace {

	public static void main(String[] args) {
		String query = "ALTER KEYSPACE tp WITH replication = {'class':'NetworkTopologyStrategy', 'datacenter1':3};";
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		Session session = cluster.connect();
		session.execute(query);
		System.out.println("Keyspace altered");

	}

}
