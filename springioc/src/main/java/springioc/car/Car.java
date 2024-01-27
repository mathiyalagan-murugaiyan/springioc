package springioc.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("1")
	private int id;
	@Value("bmw")
	private String cname;
	@Value("9876556789")
	private long mno;
	@Autowired
	private Engine engine;
	
//	public Car(int id, String cname, long mno, Engine engine) {
//		super();
//		this.id = id;
//		this.cname = cname;
//		this.mno = mno;
//		this.engine = engine;
//	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", cname=" + cname + ", mno=" + mno + ", engine=" + engine + "]";
	}

	

	

}
