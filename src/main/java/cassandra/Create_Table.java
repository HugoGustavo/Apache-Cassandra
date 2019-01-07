package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Create_Table {

	public static void main(String[] args) {
		String query = "CREATE TABLE emp  ( " +
				"emp int PRIMARY KEY," +
				"emp_name text," +
				"emp_city text," +
				"emp_sal varint," +
				"emp_phone varint );";
		
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tp");
		session.execute(query);
		System.out.println("Table created");

	}

}
