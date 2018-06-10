package cn.itcast.p1.string.demo;

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc");
		String s1 = s.intern();
		System.out.println(s1 == s);
		

	}

}
