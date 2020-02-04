
public class Frog {

	private String color;
	private String name;
	
	public Frog(){}
	public Frog(String color, String name){
		this.name = name;
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
}