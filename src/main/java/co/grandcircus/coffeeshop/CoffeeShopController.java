package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;




@Controller
public class CoffeeShopController {

	@Autowired
	MenuService menuService;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private MenuItemDao menuItemDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/userRegistration")
	public ModelAndView showForm() {
		return new ModelAndView("userRegistration");
	}


//	@RequestMapping("/welcome")
//	public ModelAndView showUser(User user) {
//		ModelAndView mv = new ModelAndView("welcome");
//		mv.addObject("user", user);
//		return mv;
//	}
	
	@PostMapping("/userRegistration")
	public ModelAndView addSubmit(User user) {		
		
		userDao.create(user);
		return new ModelAndView("redirect:/");
	}

//	@RequestMapping("/menu")
//	// makes it so you don't have to specify which category
//	public ModelAndView listFood() {
//		ModelAndView mav = new ModelAndView("menu");
//
//		mav.addObject("items", menuService.getAllMenuItems());
//
//		return mav;
//	}
	
	
	//showing the list of items from the database
	@RequestMapping("/menu")
	public ModelAndView list() {
		List<MenuItem> list = menuItemDao.findAll();
		return new ModelAndView("menu", "items", list);
	}
	
	@RequestMapping("/itemAdmin")
	public ModelAndView showItemAdmin() {
		List<MenuItem> list = menuItemDao.findAll();
		return new ModelAndView("itemAdmin", "items", list);
		
	}
	@RequestMapping("/edit")
	public ModelAndView editItem() {
		return new ModelAndView("edit");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteItem() {
		return new ModelAndView("delete");
	}

}
