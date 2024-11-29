package JavaLearning.Oops.Abstract.LearnAutomationOnline;

public class BMW extends Car {

	@Override
	public void engineSecret() {
		System.out.println("BMW engine secret");
	}

	@Override
	public void companyVault() {
		System.out.println("BMW company vault");
	}

	public static void main(String[] args) {
		Car bmw = new BMW();
		bmw.engineSecret();
		bmw.companyVault();
	}

}
