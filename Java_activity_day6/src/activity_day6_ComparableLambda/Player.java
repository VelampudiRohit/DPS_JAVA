package activity_day6_ComparableLambda;


public class Player implements Comparable<Player>  {
	private String name;

	public Player(){
		super();
	}
	public Player(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 @Override
	    public String toString() {
	        return name;
	    }
	 
	 
	@Override
	public int compareTo(Player player) {
		
		return this.name.compareTo(player.getName());
	}

}