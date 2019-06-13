package main.java.com.adp.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private double cartTotal = 0.0d;
	private double salesTax = 0.0d;

	public double getCartTotal() {
		return cartTotal;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void addToCartTotal(double cost) {
		this.cartTotal = cartTotal + cost;
	}

	public void addToSalesTax(double tax) {
		this.salesTax = salesTax + tax;
	}

	List<Product> cartItems = new ArrayList<Product>();

	public void addToCart(Product product) {
		cartItems.add(product);
		addToCartTotal(product.getPrice());
		addToSalesTax(((product.getPrice()*product.getType().getSalesTax())/100));
	}

}
