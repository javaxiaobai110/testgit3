package cn.itcast.p1.string.demo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringConstructorDemo2();

	}

	private static void stringConstructorDemo2() {
		// TODO Auto-generated method stub
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr,1,3);
		System.out.println(s);//能把一个数组变成字符串，也能把数组中的一部分变成字符串
	}

	private static void stringConstructorDemo() {
		// TODO Auto-generated method stub
		String s = new String();//String s = "";内容一样地址不一样，不等效于String s = null;
		byte[] arr = {97,66,67,68};
		String str = new String(arr);//将一个字节数组变成字符串
		System.out.println(str);
	}

}
