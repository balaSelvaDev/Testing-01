package JavaLearning.Java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Song> songService = songService();
		// imperative approach
		System.out.println("-----IMPERATIVE APPROACH-----");
		List<Song> songList = new ArrayList<>();
		for (Song song : songService) {
			if (song.getYear() >= 2010)
				songList.add(song);
		}
		songList.forEach(System.out::println);

		// declarative approach
		System.out.println("-----DECLARATIVE APPROACH-----");
		System.out.println("---> FILTER");
		List<Song> filterList = songService.stream().filter(list -> list.getYear() >= 2010)
				.collect(Collectors.toList());
		filterList.forEach(System.out::println);

		System.out.println("---> SORTED");
		List<Song> sortedList = songService.stream().sorted(Comparator.comparing(Song::getYear))
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);

		System.out.println("---> ALL MATCH");
		boolean isGreaterThan1980_allMatch = songService.stream().allMatch(list -> list.getYear() >= 1980);
		System.out.println("isGreaterThan1980_allMatch: " + isGreaterThan1980_allMatch);
		Boolean isGreaterThan2025_allMatch = songService.stream().allMatch(list -> list.getYear() >= 2025);
		System.out.println("isGreaterThan2025_allMatch: " + isGreaterThan2025_allMatch);

		System.out.println("---> ANY MATCH");
		boolean isGreaterThan2010_anyMatch = songService.stream().anyMatch(list -> list.getYear() >= 2010);
		System.out.println("isGreaterThan2010_anyMatch: " + isGreaterThan2010_anyMatch);
		Boolean isGreaterThan2020_anyMatch = songService.stream().anyMatch(list -> list.getYear() >= 2020);
		System.out.println("isGreaterThan2020_anyMatch: " + isGreaterThan2020_anyMatch);

		System.out.println("---> NONE MATCH");
		boolean isGreaterThan2010_noneMatch = songService.stream().noneMatch(list -> list.getYear() >= 2010);
		System.out.println("isGreaterThan2010_noneMatch: " + isGreaterThan2010_noneMatch);
		Boolean isGreaterThan2020_noneMatch = songService.stream().noneMatch(list -> list.getYear() >= 2020);
		System.out.println("isGreaterThan2020_noneMatch: " + isGreaterThan2020_noneMatch);

		System.out.println("---> MAX");
		Optional<Song> maxOfYear = songService.stream().max(Comparator.comparing(Song::getYear));
		System.out.println(maxOfYear);
		songService.stream().max(Comparator.comparing(Song::getYear)).ifPresent(System.out::println);

		System.out.println("---> MIN");
		Optional<Song> minOfYear = songService.stream().min(Comparator.comparing(Song::getYear));
		System.out.println(minOfYear);
		songService.stream().min(Comparator.comparing(Song::getYear)).ifPresent(System.out::println);

		System.out.println("---> GROUP BY");
		Map<Integer, List<Song>> groupByList = songService.stream().collect(Collectors.groupingBy(Song::getYear));
		groupByList.forEach((list, list1) -> {
			System.out.println(list);
			list1.forEach(System.out::println);
		});

	}

	public static List<Song> songService() {
		return List.of(new Song("Mera Naam Mary", "Brothers", 2015), new Song("Teri Bindiya Re", "Abhimaan", 2005),
				new Song("Frenny O Frenny", "Khatta Meetha", 1987), new Song("Suno Aisha", "Aisha", 2005),
				new Song("Alizeh", "Ae Dil Hai Mushkil", 2016));
	}

}

class Song {

	private String title;
	private String artist;
	private Integer year;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(String title, String artist, Integer year) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

}
