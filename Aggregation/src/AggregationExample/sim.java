package AggregationExample;

public class sim {
	
	 private long number;
     private long serialNumber;
     private String provider;
	public sim(long number, long serialNumber, String provider) {
		super();
		this.number = number;
		this.serialNumber = serialNumber;
		this.provider = provider;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
     
     
     

}
