package lesson14;

public class Task2 {
	public static void main(String[] args) {
//		//Thread th = new MyThread();
//		Thread thr = new Thread(new MyRunnuble());
//		thr.start();
//
//		for (int i = 0; i < 100; i++) {
//			System.out.println("main " + i);
//		i++;
//		}
		MyThread th = new MyThread();
		th.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();
	}
}

class MyRunnuble implements Runnable {

	@Override
	public void run() {
		for (int i = 0;!Thread.currentThread().isInterrupted(); i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			i++;
		}
	}
}

class MyThread extends Thread {
	private boolean isStop;

	@Override
	public void run() {
		for (int i = 0; !isInterrupted(); i++) {
			System.out.println(getName() + " " + i);
			try {
				Thread.sleep(Long.MAX_VALUE);
			} catch (InterruptedException e) {
				interrupt();
				e.printStackTrace();
			}
		}

		if (isStop)
			return;
	}

//	public void myStop() {
//		isStop = true;
//	}
}
