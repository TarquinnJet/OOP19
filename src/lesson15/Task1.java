package lesson15;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class A implements Runnable {
	private File file;
	private String name;
	private ThreadPoolExecutor executer;

	public A(File file, String name, ThreadPoolExecutor executer) {
		this.file = file;
		this.name = name;
		this.executer = executer;
	}

	@Override
	public void run() {
		File[] files = file.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) {
					// find(f, name);
					// new Thread(new A(f, name)).start();
					executer.execute(new A(f, name, executer));
				} else if (f.getName().contains(name)) {
					System.out.println(f.getPath());
				}
			}

		}
	}

}

public class Task1 {
	public static void main(String[] args) {
		File file = new File("c:/");

		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 100, 60,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		new Thread(new A(new File("c:/"), "text", pool));
	}

	private static void find(File file, String name) {
		File[] files = file.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) {
					find(f, name);
				} else if (f.getName().equals(name)) {
					System.out.println(f.getPath());
				}
			}

		}
	}
}
