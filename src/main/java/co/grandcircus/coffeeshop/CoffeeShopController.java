package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;




@Controller
public class CoffeeShopController {
	
	@Autowired
	MenuService menuService;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/userRegistration")
	public ModelAndView showForm() {
		return new ModelAndView("userRegistration");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView showUser(User user) {
	ModelAndView mv = new ModelAndView("welcome");
	mv.addObject("user", user);
	return mv;
}
	

	
	@RequestMapping("/menu")
	//makes it so you don't have to specify which category
	public ModelAndView listFood() {
		ModelAndView mav = new ModelAndView("menu");

			mav.addObject("items", menuService.getAllMenuItems());

		return mav;
	}



}
