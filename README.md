# shoppingcart

run the below test to check the shopping cart

static ShoppingCart sc = new ShoppingCart();

	@BeforeAll
	public static void init() {

		String[] productNames = { "Bike", "Car", "Cycle" };
		Double[] productPrice = { 40.00d, 60.00d, 30.00d };
		Integer[] stock = { 10, 6, 40 };
		ProductType[] productType = { ProductType.A, ProductType.B, ProductType.C };

		for (int i = 0; i < productNames.length; i++) {
			sc.addToCart(new Product(i + 1, productNames[i], productPrice[i], stock[i], productType[i]));
		}
	}

	@Test
	void shoppingCartTotalAndSalesTax() {

		assertEquals(130.00d, sc.getCartTotal(), 0);
		assertEquals(16.00d, sc.getSalesTax(), 0);
	}
