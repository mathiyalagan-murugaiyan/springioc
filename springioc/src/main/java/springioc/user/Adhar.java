package springioc.user;

public class Adhar {
	
	private int id;
	
	private String city;
	
	private long adharNo;
	
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Adhar [id=" + id + ", city=" + city + ", adharNo=" + adharNo + ", user=" + user + "]";
	}
	
	

}
