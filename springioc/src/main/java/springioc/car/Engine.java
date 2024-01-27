package springioc.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value("1")
	private int id;
	@Value("987654321")
	private long serialno;
	@Value("650")
	private int cc;

//	public Engine(int id, long serialno, int cc) {
//		super();
//		this.id = id;
//		this.serialno = serialno;
//		this.cc = cc;
//	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", serialno=" + serialno + ", cc=" + cc + "]";
	}
	
	
	
	

}
