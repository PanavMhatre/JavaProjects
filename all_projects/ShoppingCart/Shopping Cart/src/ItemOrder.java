
public class ItemOrder {
	Item item;
	int qty;
	public ItemOrder(Item item, int qty) {
		this.item = item;
		this.qty = qty;
	}
	public double getPrice() {
		return item.priceFor(qty);
	}
	public Item getItem() {
		return item;
	}
	
	public int getQty() {
		return qty;
	}
	
	@Override
	public boolean equals(Object obj) {
		ItemOrder other = (ItemOrder) obj;
		return item.equals(other.getItem());
	}
	
	public static void main(String[] args) {
		ItemOrder order = new ItemOrder(new Item("sandwhich", 1), 2);
		System.out.println(order.getPrice());
	}
}
