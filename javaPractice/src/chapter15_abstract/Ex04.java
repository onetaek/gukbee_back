package chapter15_abstract;
import java.util.ArrayList;

abstract class Car{
	protected String name;
	Car(String name){
		this.name= name;
	}
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public abstract void carCleaning();
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		carCleaning();
	}
}

class Sonata extends Car{

	Sonata() {
		super("Sonata");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name + " 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 끕니다.");
	}

	@Override
	public void carCleaning() {
		// TODO Auto-generated method stub
		System.out.println("세차를 합니다.");
	}
	
}
class Grandeur extends Car{

	Grandeur() {
		super("Grandeur");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name + " 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 끕니다.");
	}
	@Override
	public void carCleaning() {
		// TODO Auto-generated method stub
		System.out.println("세차를 합니다.");
	}
	
	
}
class Avante extends Car{

	Avante() {
		super("Avante");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name + " 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 끕니다.");
	}
	@Override
	public void carCleaning() {
		// TODO Auto-generated method stub
		System.out.println("세차를 합니다.");
	}
	
	
	
}
class Genesis extends Car{

	Genesis() {
		super("Genesis");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name + " 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " 시동을 끕니다.");
	}
	@Override
	public void carCleaning() {
		// TODO Auto-generated method stub
		System.out.println("세차를 합니다.");
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car: carList) {
			car.run();
			System.out.println("================");
		}
	}

}
