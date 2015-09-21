import java.util.ArrayList;

public class MusicLibrary
	{
		private static ArrayList<Song> library = new ArrayList<Song>();
		public static void main(String[] args)
			{
				createSongs();
				printList();
				cutSongs();
				deleteLongSong();
				iDidntStealThis();
			}
		public static void createSongs()
			{
				library.add(new Song("Narwhals", "Mr Weebl", 118));
				library.add(new Song("First", "Cold War Kids", 200));
				library.add(new Song("La vie en rose", "Edith Piaf", 188));
				library.add(new Song("Oh, Pretty Woman", "Roy Orbison", 177));
				library.add(new Song("Beyond the Sea", "Bobby Darin", 173));
			}
		public static void printList()
			{
				for(int i = 0; i < library.size(); i++)
					{
						System.out.print(library.get(i).getTitle());
						System.out.print(", " + library.get(i).getArtist());
						System.out.println(" (Length: " + library.get(i).getLength() + " seconds.) ");
					}
				System.out.println("\n");
			}
		public static void cutSongs()
			{
				for(int i = 0; i < library.size(); i++)
					library.get(i).setLength(library.get(i).getLength() - 10);
				printList();
			}
		public static void deleteLongSong()
			{
				String longSong = "";
				int spot = -1;
				for(int i = 0; i < library.size(); i++)
					{
						if(longSong.length() < library.get(i).getTitle().length())
							{
								longSong = library.get(i).getTitle();
								spot = i;
							}
					}
				library.remove(spot);
				printList();
			}
		public static void iDidntStealThis()
			{
				library.get(0).setArtist("Davis Ranney");
				printList();
			}

	}
