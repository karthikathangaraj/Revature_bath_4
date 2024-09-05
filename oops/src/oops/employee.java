package oops;

public class employee {

	int sno;
	String name;
	public int getSno() {
		return sno;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
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
}
