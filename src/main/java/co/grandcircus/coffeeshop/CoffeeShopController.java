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
	public ModelAndView showStory(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("uname") String uname, @RequestParam("email") String email,
			@RequestParam("select") String select) {
		ModelAndView mv = new ModelAndView("welcome");
		String pword = null;
		mv.addObject("fname", fname);
		mv.addObject("lname", lname);
		mv.addObject("uname", uname);
		mv.addObject("email", email);
		mv.addObject("pword", pword);
		mv.addObject("select", select);
		return mv;
	}

}
