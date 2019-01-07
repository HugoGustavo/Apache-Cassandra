package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Delete_Column {

	public static void main(String[] args) {
		String query = "ALTER TABLE emp DROP emp_email";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tp");
		session.execute(query);
		System.out.println("Column deleted");

	}

}
