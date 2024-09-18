package Com.ENTITY;

public class User {
	private int sno;
	private String name;
	private String email;
	
	public User(int sno, String name, String email) {
		super();
		this.sno = sno;
		this.name = name;
		this.email = email;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
