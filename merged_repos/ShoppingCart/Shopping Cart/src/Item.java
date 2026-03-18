
public class Item {
	private String name;
	private double price;
	private int bulkQty;
	private double bulkPrice;
	
	
	
	public Item(String name, double price) {
		this(name, price, 0, 1);
	}
	public Item(String name, double price, int bulkQty, double bulkPrice)
	{
		if(price < 0 || bulkQty<0 || bulkPrice < 0 ) {
			throw new IllegalArgumentException("error");
		}
		
		this.name = name;
		this.price = price;
		this.bulkQty = bulkQty;
		this.bulkPrice = bulkPrice;
	}
	
	public double priceFor(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException("error");
		}
		if(quantity >= bulkQty && bulkQty>0) {
			return bulkPrice * bulkQty;
			
		}else {
			return price * quantity;
		}
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Item other = (Item) obj;
		return this.name.equals(other.getName());
	}
	
	@Override
	public String toString() {
		String toString = "";
		toString += name + ", $" + price;
		if(bulkQty>0){
			toString += " (" + bulkQty + " for " + bulkPrice + ")"; 
		}
		return toString;
	}
	
	public static void main(String[] args) {
		Item item = new Item("Sandwhich", 3.95);
		System.out.println(item.priceFor(2));
		Item item2 = new Item("Sandwhich", 3.95, 2, 2.5);
		System.out.println(item2.priceFor(4));
		System.out.println(item.equals(item2));
		System.out.println(item2.toString());
	}
	
	

}

