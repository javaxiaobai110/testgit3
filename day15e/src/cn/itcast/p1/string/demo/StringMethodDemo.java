package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringMethodDemo_3();

	}

	private static void stringMethodDemo_3() {
		// TODO Auto-generated method stub
		String s = "abc";
		//System.out.println(s.equalsIgnoreCase("ABC"));//忽略大小写，对字符串进行判断
		//System.out.println(s.contains("bc"));
		String str = "DemoTest.java";
		//System.out.println(str.startsWith("Dem"));
		//System.out.println(str.endsWith(".java"));
		System.out.println((int)'A');
		System.out.println("abc".compareTo("nvb"));
		
		
		/*byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			
			System.out.println(bytes[i]);
		}*/
	}
	

	private static void stringMethodDemo_2() {
		// TODO Auto-generated method stub
		String s = "张三.李四.王五";
		System.out.println(s.length());
		String[] s1 = s.split("\\.");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		s = "ab你";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		System.out.println("你kdskf".toUpperCase());
		System.out.println("java".replace('a', 'o'));
		String a = "java";
		String b = a.replace('n', 'b');
		System.out.println(a==b);
		System.out.println("  abj  ".trim());//去除字符串两端空格
		System.out.println("abc".concat("bgh"));
		System.out.println(String.valueOf(4)+1);//将基本数据类转为字符串
		System.out.println(""+4+1);//41
		
	}

	private static void stringMethodDemo_1() {
		// TODO Auto-generated method stub
		String s = "abcdae";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('k'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.substring(2,s.length()));
		
		
	}

}
