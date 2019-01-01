package tengo.spring.dao;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import tengo.spring.bean.User;
import tengo.spring.dao.mapper.UserMapper;

public class UserDao implements tengo.spring.impl.dao.UserDao {
	// 数据源，创建JDBCTemplate的必须参数，此处用ioc注入
	@Autowired
	private DataSource dataSource;
	// JDBCTemplate对象，可以不管打开连接，关闭连接等等一系列超级麻烦的操作，直接执行SQL语句
	private JdbcTemplate jdbcTemplateObject;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(User user) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into user");
		sql.append("(nickName,realName,imgUrl,phone,email,password,regIP,lastTime,lastIP,regChannel,addDate)");
		sql.append(" values (?,?,?,?,?,?,?,?,?,?,?)");
		jdbcTemplateObject.update(sql.toString(), user.getNickName(), user.getRealName(), user.getPhone(),
				user.getEmail(), user.getPassword(), user.getRegIP(), user.getLastTime(), user.getLastIP(),
				user.getRegChannel(), user.getAddDate());
		return;
	}

	public User getUser(Integer id) {
		String sql = "SELECT * FROM user WHERE id=?";
		User user = jdbcTemplateObject.queryForObject(sql, new Object[] { id }, new UserMapper());
		return user;
	}

	public List<User> listUsers() {
		String SQL = "SELECT * FROM user";
		List<User> students = jdbcTemplateObject.query(SQL, new UserMapper());
		return students;
	}

	public void delete(Integer id) {
		String SQL = "delete from user where id = ?";
		jdbcTemplateObject.update(SQL, id);
		return;
	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}

}
