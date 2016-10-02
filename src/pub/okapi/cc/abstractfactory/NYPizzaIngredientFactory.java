package pub.okapi.cc.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
//		return new ThinCrustDough();
		return new Dough();
	}

	public Cheese createCheese() {
//		return new ReggianoCheese();
		return new Cheese();
	}
	
	public Sauce createSauce() {
//		return new MarinaraSauce();
		return new Sauce();
	}

	@Override
	public Veggies[] createVeggies() {
//		Veggies veggies = {new Garlic(), new Onion(), new Mushroom(), new Redpepper()};
		Veggies[] veggies = {new Veggies(), new Veggies(), new Veggies(), new Veggies()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
//		return new SlicedPepperoni();
		return new Pepperoni();
	}

	@Override
	public Clams createClam() {
//		return new FreshClams();
		return new Clams();
	}
}
