package springioc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Adhar {
	
	@Value("1")
	private int id;
	@Value("chennai")
	private String city;
	@Value("9383636353")
	private long adharNo;
	@Autowired
	private User user;

//	public Adhar(int id, String city, long adharNo, User user) {
//		super();
//		this.id = id;
//		this.city = city;
//		this.adharNo = adharNo;
//		this.user = user;
//	}
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public long getAdharNo() {
//		return adharNo;
//	}
//
//	public void setAdharNo(long adharNo) {
//		this.adharNo = adharNo;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "Adhar [id=" + id + ", city=" + city + ", adharNo=" + adharNo + ", user=" + user + "]";
	}
	
	

}
