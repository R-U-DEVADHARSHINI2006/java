package itjava.example;

public class mythreads extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+" ");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		mythreads t3 = new mythreads();
		mythreads t4 = new mythreads();
		t3.start();
		t4.start();

	}

}
