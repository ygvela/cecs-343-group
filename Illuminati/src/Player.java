
public class Player {
	private String name;
	private String Illuminati;
	private int income;

	Player() {
		name = "";
		Illuminati = "";
		income = 0;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nIlluminati: " + Illuminati + "\n";
	}
	
	public void set_Name(String name) {
		this.name = name;
	}
	
	public String get_Name() {
		return name;
	}
	
	public void set_Illuminati(String Illuminati) {
		this.Illuminati = Illuminati;
	}
	
	public String get_Illuminati() {
		return Illuminati;
	}
	
	public void set_Income(int money) {
		income = money;
	}
	
	public int get_Income() {
		return income;
	}
}
