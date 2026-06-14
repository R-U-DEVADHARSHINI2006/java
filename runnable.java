package itjava.example;

public class runnable implements Runnable {
public void run() {
	System.out.println("Thread is running");
}
public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1=new Thread(t);
        t1.start();
}
}
