package tengo.spring.impl.dao;

import java.util.List;

import javax.sql.DataSource;

import tengo.spring.bean.User;

public interface UserDao {
	/**
	 * ��ʼ��sql����Դ�ķ���������ԴDataSource�����������ݿ����ӵ�������ԣ��������ݿ����͡����ݿ��ַ�����ݿ��˺�����ȵ�
	 */
	public void setDataSource(DataSource ds);

	public void create(User user);

	public User getUser(Integer id);

	public List<User> listUsers();

	public void delete(Integer id);

	public void update(User user);
}
