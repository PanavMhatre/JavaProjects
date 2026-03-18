import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<ItemOrder> orders;
	public ShoppingCart() {
		orders = new ArrayList<>();
	}
	public void add(ItemOrder newOrder) {
		int index = 0;
		for(int i =0; i<orders.size();i++) {
			if(orders.get(i).equals(newOrder)){
				orders.set(i, newOrder);
				index++;
			}
		}
		if(index==0)
		orders.add(newOrder);
		
		
		
	}
	public double getTotal() {
		double total = 0;
		for(int i = 0;i<orders.size();i++) {
			total += orders.get(i).getPrice();
		}
		return total;
	}
}
