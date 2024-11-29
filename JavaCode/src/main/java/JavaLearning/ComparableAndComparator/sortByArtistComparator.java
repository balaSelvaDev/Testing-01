package JavaLearning.ComparableAndComparator;

import java.util.Comparator;

public class sortByArtistComparator implements Comparator<Song> {

	@Override
	public int compare(Song song, Song anotherSong) {
		return song.getArtist().compareTo(anotherSong.getArtist());
	}

}
