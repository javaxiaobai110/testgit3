package cn.itcast.p1.string.demo;

public class StringTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdkjeiusm";
		String s2 = "kladbjckd";
		//String s3 = s2.substring(2, 6);
		//System.out.println(s3);
		String s = getMaxSubString(s1,s2);
		System.out.println("最大子串为："+s);
	}

	private static String getMaxSubString(String s1, String s2) {
		// TODO Auto-generated method stub
		String max = null;
		String min = null;
		max = (s1.length() > s2.length())?s1:s2;
		min = max.equals(s1)?s2:s1;
		System.out.println(max);
		System.out.println(min);
		if(s1.contains(s2))
			return s2;
		for (int i = 0; i < min.length(); i++) {
			for (int a = 0, b = min.length() - i; b < min.length() + 1;b++, a++) {
				String sub =min.substring(a, b); 
				if(s1.contains(sub))
					return sub;
			}
		}
		return null;
	}

}
