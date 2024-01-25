package springioc.user;

public class User {
	
	private int id;
	
	private String name;
	
	private long contact;

	
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	

}
