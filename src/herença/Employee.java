package herença;

public class Employee {
	
	private String name;
	private Integer hour;
	private Double valuePerHour;
	
	
	public Employee()
	{
		
	}
	


	public Employee(String name, Integer hour, Double valuePerHour) {
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Employee(Integer hour) {
		super();
		this.hour = hour;
	}

	public void sethour(Integer hour) {
		this.hour = hour;
	}
	

	public Integer getHour() {
		return hour;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return valuePerHour * hour;
	}

}

