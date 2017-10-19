package test;

import java.sql.Timestamp;

public class Test {
public static void main(String[] args) {
	String dt="2017-06-15 10:10:10.0122";
	Timestamp ts = Timestamp.valueOf(dt);
	System.out.println(ts);
	DateTime d = new DateTime();
}
}
