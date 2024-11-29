package JavaLearning.Oops.Polymorphism.LearnAutomationOnline;

import java.io.IOException;

public class ChildClass extends ParentClass {

	@Override
	public void marriage() {
		System.out.println("marriage method(Child class)");
	}
	
	@Override
	public void exception() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws Exception {
		// dynamic polymorphism
		ParentClass obj = new ChildClass();
		obj.properties();
		obj.marriage();
		obj.exception();
		// parent class laa private method irunthaa atha override panna mudiyathu
		// child method laa exception throw panna parent class la yum throw pannanum or greater exception
	}

}
