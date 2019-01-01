package tengo.spring.impl.dao;

import java.util.List;

import javax.sql.DataSource;

import tengo.spring.bean.User;

public interface UserDao {
	/**
	 * 初始化sql数据源的方法。数据源DataSource包含了与数据库连接的相关属性，比如数据库类型、数据库地址、数据库账号密码等等
	 */
	public void setDataSource(DataSource ds);

	public void create(User user);

	public User getUser(Integer id);

	public List<User> listUsers();

	public void delete(Integer id);

	public void update(User user);
}
