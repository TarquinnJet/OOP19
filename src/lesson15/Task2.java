package lesson15;

import java.io.File;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 100, 60,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		pool.execute(new A(new File("c:/"), "fg", pool));

		while (pool.getActiveCount() > 0) {
			Thread.sleep(500);
		}

		pool.shutdown();
	}
}
