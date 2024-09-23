package GenericsExample;

public class Genricswithclass {

	public static void main(String[] args) {
		Info<Integer> o1=new Info<>();
		o1.set(12);
		System.out.println(o1.get());
		Info<String> o2=new Info<>();
		o2.set("karthika");
		System.out.println(o2.get());

	}

}
