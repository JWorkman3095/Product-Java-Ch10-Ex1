
public class Album extends Product {
	
	private String artist;
	
	public Album() {
		super();
		artist = "";
		count++;
	}
	
	public void setArtist(String artits) {
		this.artist = artist;
	}
	
	public String Artist() {
	 	return artist;
	}
	
	@Override
	public String toString () {
		return super.toString() + " by " + artist;
	}
}
