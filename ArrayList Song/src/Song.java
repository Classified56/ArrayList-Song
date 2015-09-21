
public class Song
	{
		private String title;
		private String artist;
		private int length;
		public Song(String t, String a, int l)
			{
				title = t;
				artist = a;
				length = l;
			}
		public String getTitle()
			{
				return title;
			}
		public void setTitle(String title)
			{
				this.title = title;
			}
		public String getArtist()
			{
				return artist;
			}
		public void setArtist(String artist)
			{
				this.artist = artist;
			}
		public int getLength()
			{
				return length;
			}
		public void setLength(int length)
			{
				this.length = length;
			}
		
	}
