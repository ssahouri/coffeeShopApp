package co.grandcircus.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/userRegistration")
	public ModelAndView showForm() {
		return new ModelAndView("userRegistration");
	}

	@RequestMapping("/welcome")
	public ModelAndView showStory(@RequestParam("fname") String fname) {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("fname", fname);
		String lname = null;
		String uname= null;
		String pword = null;
		String select = null;
		mv.addObject("lname", lname);
		mv.addObject("uname", uname);
		mv.addObject("pword", pword);
		mv.addObject("select", select);
		return mv;
	}

}
