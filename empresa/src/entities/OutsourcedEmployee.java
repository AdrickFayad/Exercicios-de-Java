package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionlCharge;

	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePorHour, Double additionlCharge) {
		super(name, hours, valuePorHour);
		this.additionlCharge = additionlCharge;
	}

	public Double getAdditionlCharge() {
		return additionlCharge;
	}

	public void setAdditionlCharge(Double additionlCharge) {
		this.additionlCharge = additionlCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionlCharge * 1.1;
	} 
	
}
