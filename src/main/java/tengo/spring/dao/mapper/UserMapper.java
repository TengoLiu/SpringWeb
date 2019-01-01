package tengo.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tengo.spring.bean.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setNickName(rs.getString("nickName"));
		user.setRealName(rs.getString("realName"));
		user.setImgUrl(rs.getString("imgUrl"));
		user.setPhone(rs.getString("phone"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setRegIP(rs.getString("regIP"));
		user.setLastTime(rs.getDate("lastTime"));
		user.setLastIP(rs.getString("lastIP"));
		user.setRegChannel(rs.getString("regChannel"));
		user.setAddDate(rs.getDate("addDate"));
		return user;
	}

}
