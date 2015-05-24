package lesson13;

import java.sql.SQLException;

public class Task1 {
	public static void main(String[] args) {
		a();
//		for (int i = 0; i < 2; i++) {
//			try {
//				foo();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			System.out.println();

		}
	private static void a() {
		b();
		
	}
	private static void b() {
		c();
	}
	private static void c() {
		// TODO Auto-generated method stub
		try {
			d();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private static void d() throws SQLException{
		if(true) throw new SQLException();
	}
	

	public static void foo() throws SQLException{
		
		for (int i = 0; i < 2; i++) {
			System.out.print(0);
			if (true)
				continue;
			if(true) throw new SQLException();
//			if (true)
//				break;
//			if (true)
//				return;
//			if (true)
//				throw new RuntimeException();
			System.out.print(1);
		}
		System.out.print(2);
	}
}
