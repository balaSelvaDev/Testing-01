package JavaLearning.Java8.MethodReference.YT;

/**
 * @date 28-09-2024
 * @author hpl-01
 * @yt_link https://youtu.be/5vvYzRYjrHY?si=cKQFdFqZySYnTtWu
 *
 */
public class ConstructorMethodReference {

	public static void main(String[] args) {

		UserInterface lambda_user = (s) -> new User(s);
		User lamdba_user = lambda_user.getUserDetails("John");
		System.out.println("USER = " + lamdba_user);

		UserInterface constructor_mf_user = User::new;
		User user = constructor_mf_user.getUserDetails("John");
		System.out.println("USER = " + user);

	}

}

interface UserInterface {
	User getUserDetails(String userName);
}

class User {

	String userName;

	public User(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + "]";
	}

}