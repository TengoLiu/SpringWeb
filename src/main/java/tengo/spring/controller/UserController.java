package tengo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.collections.MappingChange.Map;

import tengo.spring.bean.User;
import tengo.spring.impl.dao.UserDao;

@Controller
@RequestMapping("/api//user")
public class UserController {

	@Autowired
	UserDao dao;

	@RequestMapping({ "/", "list" })
	public String list() {
		return dao.listUsers().toString();
	}

	@RequestMapping({ "detail" })
	public String detail(Integer id) {
		User user = dao.getUser(id);
		return user.toString();
	}

}
