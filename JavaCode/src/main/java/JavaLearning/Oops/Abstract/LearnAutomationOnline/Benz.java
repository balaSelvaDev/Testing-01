package JavaLearning.Oops.Abstract.LearnAutomationOnline;

public class Benz extends Car {

	@Override
	public void engineSecret() {
		System.out.println("Benz engine secret");
	}

	@Override
	public void companyVault() {
		System.out.println("Benz company vault");
	}

	public static void main(String[] args) {
		Car benz = new Benz();
		benz.engineSecret();
		benz.companyVault();
	}

}