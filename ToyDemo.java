public class ToyDemo{
	public static String getLeastPriceToy(Toy one,Toy two,Toy three,Toy four,String category){
	
		Toy result = one;
		if(two.getCategory().equals(category) && (two.getPrice()-two.getDiscount())<(result.getPrice()-result.getDiscount())){
			result =two;
		}
		if(three.getCategory().equals(category) && (three.getPrice()-three.getDiscount())<(result.getPrice()-result.getDiscount())){
			result =three;
		}
		if(four.getCategory().equals(category) && (four.getPrice()-four.getDiscount())<(result.getPrice()-result.getDiscount())){
			result =four;
		}
		return result.getName();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy one=new Toy("Banana","fruit",100,10.5); 
		Toy two=new Toy("Orange","fruit",300,30);
		Toy three=new Toy("Lion","animal",50,5);
		Toy four=new Toy("Tiger","animal",70,7);
		System.out.println(getLeastPriceToy(one, two, three, four,"fruit"));
		System.out.println(getLeastPriceToy(one, two, three, four,"animal"));
	}	

		
		
	
}