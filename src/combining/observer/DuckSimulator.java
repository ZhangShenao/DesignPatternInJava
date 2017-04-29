package combining.observer;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
  
	void simulate(AbstractDuckFactory duckFactory) {
  
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
 
		Flock flockOfDucks = new Flock();
 
		flockOfDucks.addDuck(redheadDuck);
		flockOfDucks.addDuck(duckCall);
		flockOfDucks.addDuck(rubberDuck);
 
		Flock flockOfMallards = new Flock();
 
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.addDuck(mallardOne);
		flockOfMallards.addDuck(mallardTwo);
		flockOfMallards.addDuck(mallardThree);
		flockOfMallards.addDuck(mallardFour);

		flockOfDucks.addDuck(flockOfMallards);

		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuackCount() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
