package cn.itcast.p2.stringbuffer.demo;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 1, 5, 8 };
		String s = arrayToString(arr);
		System.out.println(s);
	}

	private static String arrayToString(int[] arr) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				s.append(arr[i] + ",");
			else
				s.append(arr[i] + "]");

		}
		return s.toString();
	}

}
