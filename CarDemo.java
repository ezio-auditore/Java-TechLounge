public class CarDemo{
	public static String bestCar(Car one,Car two,Car three,Car four,char compareType){
		Car[] carlist = {one,two,three,four};
		Car result;
		if(compareType=='c'){
			//capacity
			result=carlist[0];
			for(int i=1;i<4;i++){
				if(carlist[i].getPassengerCapacity()>result.getPassengerCapacity()){
					result = carlist[i];
				}
			}
			return (result.getMake()+"-"+result.getModel());
			
		}
		else if(compareType=='p'){
			//price
			result=carlist[0];
			for(int i=1;i<4;i++){
				if(carlist[i].getOnRoadPrice()>result.getOnRoadPrice()){
					result = carlist[i];
				}
			}
			return (result.getMake()+"-"+result.getModel());
		}
		else{
			return "Invalid Compare Type Parameter";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car one =new Car("Hyundai","Santro",5,5.5);
		Car two =new Car("Hyundai","accent",6,7.5);
		Car three =new Car("Maruti","Wagnonr",6,5.5);
		Car four =new Car("Maruti","echo",7,4.5);
		char compareType = 'p';
		System.out.println(bestCar(one,two,three,four,compareType));
	}

}