package haaga.lms.lms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LmsController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/test")
	public String test() {
		return "Hello World !";
	}

}