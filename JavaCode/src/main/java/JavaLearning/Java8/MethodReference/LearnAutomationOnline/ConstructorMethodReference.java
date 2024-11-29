package JavaLearning.Java8.MethodReference.LearnAutomationOnline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
 * @date 28-09-2024
 * @author hpl-01
 * @yt_link https://youtu.be/Tu6c1aw5XZg?si=fJf55Z3JTV3cvRWq
 */
public class ConstructorMethodReference {

	public static void main(String[] args) {

		List<String> heroesList = new ArrayList<String>(List.of("Batman", "Superman", "Flash", "Batman"));
		System.out.println("LIST OF HEROES = " + heroesList);

		Set<String> heroesSet = new HashSet<String>(heroesList);
		System.out.println("LIST OF HEROES(REMOVED DUPLICATES) = " + heroesSet);

		Function<List<String>, Set<String>> lambda_listToSet = (list) -> new HashSet<String>(heroesList);
		System.out.println(
				"LIST OF HEROES(REMOVED DUPLICATES) USING LAMBDA EXPRESSION = " + lambda_listToSet.apply(heroesList));

		// NOTE: All lamdba expression can't be translated to method reference
		Function<List<String>, Set<String>> construcotor_mr_listToSet = HashSet::new;
		System.out.println("LIST OF HEROES(REMOVED DUPLICATES) USING CONSTRUCTOR METHOD REFERENCE = "
				+ construcotor_mr_listToSet.apply(heroesList));
	}

}
