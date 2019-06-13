package main.java.com.adp.shoppingcart;

public enum ProductType {

	A {
		public double getSalesTax() {
			return 10;
		}
	},
	B {
		public double getSalesTax() {
			return 20;
		}
	},
	C {
		public double getSalesTax() {
			return 0;
		}
	};

	public abstract double getSalesTax();

}
