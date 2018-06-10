package cn.itcast.p1.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String类的特点
		 * 字符串对象一旦被初始化就不会被改变
		 * 
		 */
		stringDemo2();

	}

	private static void stringDemo2() {
		String s = "abc";
		String s1 = new String("abc");
		
		System.out.println(s == s1);//false
		
		
	}

	private static void stringDemo1() {
		String s = "abc";//"abc"存储在字符串常量池中,在常量池中创建一个对象
		String s1 = "abc";
		
		System.out.println(s == s1);
	}

}
