package cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Batch {

	public static void main(String[] args) {
		String query =
				"BEGIN BATCH " +
						"INSERT INTO emp (emp_id, emp_city, emp_phone, emp_sal) values (4, 'Pune', 'rajeev', 984822331, 30000);" +
						"UPDATE emp SET emp_sal = 50000 WHERE wmp_id = 3;" +
						"DELETE emp_city FROM emp WHERE emp_id = 2;" +
				"APPLY BATCH";
		Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
		Session session = cluster.connect("tp");
		session.execute(query);
		System.out.println("Changes done");

	}

}
