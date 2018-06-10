package cn.itcast.p2.stringbuffer.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bufferMethodDemo_2();

	}

	private static void bufferMethodDemo_2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abcd");
//		sb.delete(1, 3);
//		sb.delete(0, sb.length());
//		int s = sb.indexOf("qq");
//		int s2 = sb.indexOf("bc", 2);
//		sb.replace(1, 3, "nba");
//		sb.setCharAt(2, 'w');
//		sb.setLength(11);
//		sb.insert(12, "abcnj");
//		System.out.println(sb);
//		System.out.println("len:"+sb.length());
		System.out.println(sb.reverse());
		
	}

	private static void bufferMethodDemo_1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hahah");
//		sb.append("abc");
		
		sb.insert(2, 34);
		
		System.out.println(sb);
	}

	private static void bufferMethodDemo() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(false);//.append("dfsmk");
		sb.insert(1, "hehe");
		sb.append(true);
		System.out.println(sb);
		
	}

}
