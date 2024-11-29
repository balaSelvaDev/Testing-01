package JavaLearning.Java8.MethodReference;

public class Mobile {

	public void show(int no) {
		System.out.println(no);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = new Mobile();
		
		// lambda expression
		// ContractInterface contract = value -> System.out.println(value);
		
//		contract.display(10);;
		ContractInterface contract = m::show;
		contract.display(10);
	}

}
