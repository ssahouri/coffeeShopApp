package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	

	@RequestMapping("/userRegistration")
	public ModelAndView showForm() {
		return new ModelAndView("userRegistration");
	}
	
	@PostMapping("/userRegistration")
	public ModelAndView addSubmit(User user) {

		userDao.createUser(user);
		return new ModelAndView("redirect:/");
	}

}
