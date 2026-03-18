import java.util.ArrayList;

public class Catalog {
	String name;
	private ArrayList<Item> items = new ArrayList<Item>();
	public Catalog(String name) {
		this.name = name;
	}
	public void add(Item item) {
		items.add(item);
	}
	public int size() {
		return items.size();
	}
	public Item get(int index) {
		return items.get(index);
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Catalog order = new Catalog("Bob");
		order.add(new Item("Sandwhich", 1.0));
		System.out.println(order.getName());
	}
}
