package cn.itcast.p1.string.demo;

public class StringTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  ab c  ";
		s = myTrim(s);
		System.out.println("-"+s+"-");
		//String s2 = "abc";
		//System.out.println(s.equals(s2));
//		String s3 = "agh";
//		String s4 = "agh";
//		System.out.println(s3 == s4);

	}

	private static String myTrim(String s) {
		// TODO Auto-generated method stub
		int start = 0, end = s.length() - 1;
		while(start <= end && s.charAt(start) == ' ')
			start++;
		while(start <= end && s.charAt(end) == ' ')
			end--;
		
		return s.substring(start, end +1);
	}

}
