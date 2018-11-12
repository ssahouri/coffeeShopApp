package co.grandcircus.coffeeshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MenuService {
	
	private List<MenuItem> list = new ArrayList<>();
	
//	public MenuService() {
//		list.add(new MenuItem("Coffee", "Light Roast", 2.65));
//		list.add(new MenuItem("Hot Chocolate", "Hot chocolate made with real cocoa, "
//				+ "topped with whipped cream", 2.55));
//		list.add(new MenuItem("Latte", "Espresso with classis espresso shots "
//				+ "poured over lightly aerated milk", 4.25));
//		list.add(new MenuItem("Cappucino", "Dark, rich espresso under a thick "
//				+ "layer of foam", 3.75));
//		list.add(new MenuItem("Mocha", "ittersweet mocha sauce, espresso and "
//				+ "steamed whole milk topped with foam", 3.05));
//	
//	}
	

	public List<MenuItem> getAllMenuItems() {
		return list;
	}



}
