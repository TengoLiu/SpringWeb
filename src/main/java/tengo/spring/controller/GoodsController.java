package tengo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tengo.spring.bean.Goods;

@Controller
@RequestMapping("/api/goods")
public class GoodsController {

	public String list() {
		return "";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public Goods detail() {
		return new Goods();
	}
}
