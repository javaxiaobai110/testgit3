package cn.itcast.p1.string.demo;

public class StringTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abckljklabcl;jiuiuabc";
		String s1 = "abc";
//		int a = s.indexOf(s1);
//		System.out.println(a);
		
		int count = getSubStringCount_1(s,s1);
		System.out.println(count);
		//int a = s.lastIndexOf("abc");
		//System.out.println(a);
	}

	private static int getSubStringCount_1(String s, String s1) {
		// TODO Auto-generated method stub
		int count = 0;
		int index = 0;
		while((index = s.indexOf(s1,index)) != -1) {
			index = index + s1.length();
			++count;
		}
		return count;//重点掌握
	}

	private static int getSubStringCount(String s, String s1) {
		// TODO Auto-generated method stub
		int count = 0;
		int index = 0;
		while((index = s.indexOf(s1)) != -1) {
			s = s.substring(index + s1.length());
			++count;
		}
		
		return count;
	}

}
