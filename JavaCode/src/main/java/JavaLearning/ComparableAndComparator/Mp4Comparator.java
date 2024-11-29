package JavaLearning.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mp4Comparator {

	public static void main(String[] args) {
		List<Song> of = List.of(new Song("New song", "name 1", 2001), new Song("Song 2", "name 2", 2006),
				new Song("Let me down slowly", "name 3", 2004));
		List<Song> musicList = new ArrayList<>(of);
		System.out.println("-----");
		Utility.iterateList(musicList);

		System.out.println("-----");
		Collections.sort(musicList, new sortByYearComparator().reversed());
		Utility.iterateList(musicList);

		System.out.println("-----");
		Collections.sort(musicList, new sortByArtistComparator());
		Utility.iterateList(musicList);
	}

}
