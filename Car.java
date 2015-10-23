public class Car{
	private String make,model;
	private int passengerCapacity;
	private double onRoadPrice;
	public Car(String make,String model,int passengerCapacity,double onRoadPrice){
		this.make=make;
		this.model=model;
		this.passengerCapacity=passengerCapacity;
		this.onRoadPrice=onRoadPrice;
	}
	public int getPassengerCapacity(){
		return passengerCapacity;
	}
	public double getOnRoadPrice(){
		return onRoadPrice;
	}
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public void setPassengerCapacity(int passengerCapacity){
		this.passengerCapacity=passengerCapacity;
	}
	public void setOnRoadPrice(double onRoadPrice){
		this.onRoadPrice=onRoadPrice;
	}
	
}