package Strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void peformFly(){
		flyBehavior.fly();
	}
	
	public void peformQuack() {
		quackBehavior.quack();
	}
}
