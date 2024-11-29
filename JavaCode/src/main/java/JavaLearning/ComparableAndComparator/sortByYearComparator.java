package JavaLearning.ComparableAndComparator;

import java.util.Comparator;

public class sortByYearComparator implements Comparator<Song> {

	@Override
	public int compare(Song song, Song anotherSong) {
		return song.getYear().compareTo(anotherSong.getYear());
	}

}
