package entities;

public final class OutsourcedEmployee extends Employee{
	
	private Employee employee = new Employee();

	public OutsourcedEmployee() {
		
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
		super(name, hours, valuePerHour);
	}
	
	//metodo de pagamentos
	@Override
	public double payment() {
		super.payment();
		return (hours * valuePerHour);
	}
	
	
}
