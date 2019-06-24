
public class primitiveEqualityTest {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(a);
		
		Object o = "123";
		System.out.println(o);
		
		String t = "12";
		System.out.println(t);
		
		String w = t + "3";
		System.out.println(w);
		
		boolean b = o.equals(a);
		System.out.println(b);
		
		boolean b2 = o.equals(t);
		System.out.println(b2);
		
		boolean b3 = o.equals(w);
		System.out.println(b3);
		
		boolean b4 = (o == w);
		System.out.println(b4);
		
		boolean b5 = o.equals(w);
		System.out.println(b5);
	}
}
