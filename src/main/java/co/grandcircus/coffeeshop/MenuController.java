package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

//	@Autowired
//	MenuService menuService;

	@Autowired
	private CartItemDao cartItemDao;

	@Autowired
	private MenuItemDao menuItemDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	// showing the list of items from the database
	@RequestMapping("/menu")
	public ModelAndView list() {
		List<MenuItem> list = menuItemDao.findAll();
		return new ModelAndView("menu", "items", list);
	}

	@RequestMapping("/addCartItem")
	public ModelAndView showAddCartItem(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView("addCartItem");
		mav.addObject("item", menuItemDao.findById(id));
		mav.addObject("title", "Add Item");
		return mav;

	}

	// same URL but different method
	@RequestMapping(value = "/addCartItem", method = RequestMethod.POST)
	public ModelAndView submitAddCartItem(CartItem item) {
		cartItemDao.create(item);
		return new ModelAndView("redirect:/cartItem");
	}
	


	@RequestMapping("/cartItem")
	public ModelAndView viewCart() {
		List<CartItem> list = cartItemDao.findAll();
		return new ModelAndView("cartItem", "cartItems", list);
	}

}
