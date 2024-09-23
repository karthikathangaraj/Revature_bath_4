package SteeamAPI;

public class Employee {
	String Name;
	String Email;
	int phone;
	public String getName() {
		return Name;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Email=" + Email + ", phone=" + phone + "]";
	}
	public Employee(String name, String email, int phone) {
		super();
		Name = name;
		Email = email;
		this.phone = phone;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

}
