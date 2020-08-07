package arrays;

public class Actor 
{
	private int id;
	private String nm;
	private String g;
	
	public Actor()
	{
		
	}
	
	public Actor(int id, String nm, String g) {
		super();
		this.id = id;
		this.nm = nm;
		this.g = g;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	
}
