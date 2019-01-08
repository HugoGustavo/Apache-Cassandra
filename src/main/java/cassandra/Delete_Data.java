package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Delete_Data {

	public static void main(String[] args) {
		String query = "DELETE FROM emp WHERE emp_id=3;";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tp");
		session.execute(query);
		System.out.println("Data deleted");

	}

}
