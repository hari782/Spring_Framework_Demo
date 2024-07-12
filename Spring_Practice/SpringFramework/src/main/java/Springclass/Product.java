package Springclass;
//c1
public class Product {
	private String prod_id, prod_name, department;
	private double price;
	public Product(String prod_id, String prod_name, String department, double price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.department = department;
		this.price = price;
	}
	public void displayProduct() {
		System.out.println("Product ID : " + prod_id);
		System.out.println("Product Name : "+prod_name);
		System.out.println("Department : "+ department);
		System.out.println("Price : "+price);
	}
}
