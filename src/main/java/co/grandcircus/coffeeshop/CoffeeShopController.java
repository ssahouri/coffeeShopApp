package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CoffeeShopController {

//	@Autowired
//	MenuService menuService;

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

		userDao.createUser(user);
		return new ModelAndView("redirect:/");
	}

	// showing the list of items from the database
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

	@RequestMapping("/add")
	public ModelAndView showCreateForm() {
		return new ModelAndView("add", "item", "Add an Item");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView submitCreateForm(MenuItem item) {
		menuItemDao.create(item);
		return new ModelAndView("redirect:/itemAdmin");
	}


	@RequestMapping("/edit")
	public ModelAndView showEditForm(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView("edit");
		mav.addObject("item", menuItemDao.findById(id));
		mav.addObject("title", "Edit Item");
		return mav;

	}

	// same URL but different method
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView submitEditForm(MenuItem item) {
		menuItemDao.update(item);
		return new ModelAndView("redirect:/itemAdmin");
	}

	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") int id) {
		menuItemDao.delete(id);
		return new ModelAndView("redirect:/itemAdmin");
	}

}
