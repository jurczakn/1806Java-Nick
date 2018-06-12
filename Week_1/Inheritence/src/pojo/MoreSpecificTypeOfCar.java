package pojo;

public class MoreSpecificTypeOfCar extends Car{
	
	@Override
	public MoreSpecificTypeOfCar doOverride(){
		
		System.out.println("I did override this method");
		
		return this;
	}
	
	public String nox(){
		
		return "this is so fast it should be illegal";
		
	}
	
	public void fillGas(){
		
		this.gas = this.tankSize;
		System.out.println("The car is now full");
		
	}
	
	public void fillGas(Gallons g){
		
		this.gas += g.amount;
		
	}
	
	public void fillGas(Liters l){
		
		this.gas += l.amount * 3.78;
		
	}
	
	@Override //Java annotation
	public void openDoors(){
		
		System.out.println("the doors are openning vertically... THIS IS SO COOL!!!!!!");
		
	}

}
