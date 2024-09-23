package Multitheading;

public class thred3 {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		System.out.println(t.getId());
		System.out.println(t.getName());

	}

}
