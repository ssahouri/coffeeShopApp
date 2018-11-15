package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuAdminController {
	
	@Autowired
	private MenuItemDao menuItemDao;
	
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
