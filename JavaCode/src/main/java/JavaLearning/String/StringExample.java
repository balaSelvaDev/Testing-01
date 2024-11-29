package JavaLearning.String;

import JavaLearning.Oops.Inheritance.LearnAutomationOnline.Car;

public class StringExample extends Car {

	public static void main(String[] args) {

		String abc = "abc";
		System.out.println(abc.hashCode());
		String abc1 = abc;
		System.out.println(abc1.hashCode());
		abc = "newbac";
		System.out.println(abc.hashCode());
		System.out.println(abc1.hashCode());
		StringExample name = new StringExample();
		String wheelColor2 = name.wheelColor;

	}

}
