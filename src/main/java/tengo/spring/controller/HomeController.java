package tengo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/")
public class HomeController {

	@RequestMapping({ "/", "index" })
	public ModelAndView index() {
		ModelMap map = new ModelMap();
		map.put("user", "tengo");
		return new ModelAndView("home_index", map);
	}

	@RequestMapping({ "about" })
	public String about() {
		return "home_about";
	}
}
