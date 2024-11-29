package JavaLearning.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Song> of = List.of(new Song("New song", "name 2", 2001), new Song("Song 2", "name 2", 2006),
				new Song("Let me down slowly", "name 1", 2004));
		List<Song> musicList = new ArrayList<>(of);
		System.out.println("-----");
		Utility.iterateList(musicList);
		System.out.println("-----");
		Collections.sort(musicList);
		Utility.iterateList(musicList);
	}

}
