package lesson14;
//
//import java.sql.SQLException;
//
//public class Task1 {
//	public static void main(String[] args) {
//		try {
//			System.out.println("try");
//			if (true)
//				throw new Error();
//			System.out.println("endtry");
//		} catch (Error e) {
//			throw new RuntimeException();
//			
//		} catch (RuntimeException e) {
//			System.out.println("RE");
//		} finally {System.out.println("dfsdfsdf");}
//		System.out.println("end");
//	}
//}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class Task1 {

 public static void main(String[] args) {
  foo3(false);
 }

 public static void foo() {

  FileInputStream in = null;
  FileOutputStream out = null;
  try {
   in = new FileInputStream("foo");
   out = new FileOutputStream("foo2");
   //
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } finally {
   try {
    if (in != null) {
     in.close();
    }
   } catch (IOException e) {
   }
  }

 }

 public static void foo2() {

  try (FileInputStream in = new FileInputStream("foo");
    FileOutputStream out = new FileOutputStream("foo2")) {
   //
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

 }

 public static void foo3(boolean problem) {

  try (MyTest test = new MyTest()) {
   test.work(problem);
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  } catch (SQLException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
  }
 }
 
 public static void foo4(boolean problem) {
  MyTest test = null;
  try{
   test = new MyTest();
   test.work(problem);
   
  } catch (FileNotFoundException e){
   e.printStackTrace();
  } catch (SQLException e) {
   e.printStackTrace();
  } finally {
   try {
    if(test != null){
     test.close();
    }
   } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
  }
  
 }

}

class MyTest implements AutoCloseable {
 
 public MyTest() throws SQLException {
  throw new SQLException();
 }

 public void work(boolean problem) throws FileNotFoundException {
  if(problem){
   throw new FileNotFoundException();
  }
 }

 @Override
 public void close() throws IOException {
  System.out.println("close()");
 }

}