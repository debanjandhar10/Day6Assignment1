package q2;
public class GenericTester {

	public static void main(String[] args) {
		Generic<Integer> i = new Generic<Integer>(new Integer[] {1, 2, 3});
		Generic<Float> f = new Generic<Float>(new Float[] {1.1f, 2.2f, 3.3f});
		Generic<String> s = new Generic<String>(new String[] {"Deba", "Argha", "Grv"});
		Generic<Double> d = new Generic<Double>(new Double[] {1.1, 2.2, 3.3});
		System.out.println("Integer List:");
		i.display();
		System.out.println("Float List:");
		f.display();
		System.out.println("String List:");
		s.display();
		System.out.println("Double List:");
		d.display();
	}

}