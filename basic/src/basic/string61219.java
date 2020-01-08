package basic;

public class string61219 {

	public static void main(String[] args) {
		String s = "yakesh";
		String v = new String();
		v = "yakesh kumar";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(v));
		System.out.println(s.equalsIgnoreCase("YAKesh"));
		System.out.println(s.concat(v));
		System.out.println(s.substring(3));
		System.out.println(s.contains("ya"));
		System.out.println(s.startsWith("y"));
		System.out.println(s.endsWith("s"));
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println("------>");

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		System.out.println(s.replaceAll(s, "rakhesh"));
		System.out.println("------>");
		String a = "java is the program lang";
		String b[] = a.split(" ");
		for (String c : b) {
			System.out.println(c);
		}

		String f = "  YaKesh kumar  ";
		System.out.println(f.trim());
	}

}
