
public class Puzzle {
	private int id;
	private String name;
	private String tye;
	public Puzzle(int id, String name, String tye) {
		super();
		this.id = id;
		this.name = name;
		this.tye = tye;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTye() {
		return tye;
	}
	public void setTye(String tye) {
		this.tye = tye;
	}
	
	
}
