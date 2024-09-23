package Multitheading;
class Resource {
    public synchronized void method1(Resource other) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        other.method2();
    }

    public synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
    }
}
public class deadlock {

	public static void main(String[] args) {
		Resource r1 = new Resource();
        Resource r2 = new Resource(); 
        Thread t1=new Thread(()->r1.method1(r2),"k-1");
        Thread t2=new Thread(()->r2.method1(r1),"k-2");
        
        t1.start();
        t2.start();

	}

}
