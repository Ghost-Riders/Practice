package jdbctempleex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbctemplateexample {

	public static void main(String[] args) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/hibernate");
		dataSource.setUsername("postgres");
		dataSource.setPassword("cdac");

		// Insert Operation
//		String query = "insert into student(id,email,first_name,last_name) values(?,?,?,?)";
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		int x = jdbcTemplate.update(query, 1, "manmath738@gmail.com", "Manmath", "Markunde");
//		if (x > 0) {
//			System.out.println("Data inserted successfully");
//		}

		// Update Operation
//		String query = "Update student set email=? where id=?";
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		int x = jdbcTemplate.update(query, "manmath738@cdac.in", 1);
//		if (x > 0) {
//			System.out.println("Data updated successfully");
//		}

		// Delete Operation
//		String query = "Delete from student where id=?";
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		int x = jdbcTemplate.update(query, 1);
//		if (x > 0) {
//			System.out.println("Data Deleted successfully");
//		}

		// Retrive Operation
		String query = "select * from student";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		DataSource nn = jdbcTemplate.getDataSource();
		try {
			System.out.println(nn.getLoginTimeout());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				System.out.println("In row Mapper : " + rowNum);
				int count = rs.getMetaData().getColumnCount();
				for (int i = 1; i < count + 1; i++) {
					System.out.println(rs.getMetaData().getColumnName(i));
				}
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String firstName = rs.getString(3);
				String lastName = rs.getString(4);
				return new Student(id, email, firstName, lastName);
			}
		};

		List<Student> list = jdbcTemplate.query(query, rowMapper);
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
