package lesson16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Task2 {
public static void main(String[] args) throws IOException {
	OutputStream out = new FileOutputStream("");
	InputStream in = new FileInputStream("");
	copy(in,out);
}

private static void copy(InputStream in, OutputStream out) throws IOException {
	int data;
	while ((data=in.read())!=-1){
		out.write(data);
	}
	out.flush();
}

}
