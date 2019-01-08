package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Update_Data {

	public static void main(String[] args) {
		String query = "UPDATE emp SET emp_city='Delhi', emp_sal=50000 WHERE emp_id=2;";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tp");
		session.execute(query);
		System.out.println("Data updated");

	}

}
