package q2;
public class Generic<T> {
	private T[] l;
	public Generic(T[] l) {
		this.l = l;
	}
	public T[] getL() {
		return l;
	}
	public void setL(T[] l) {
		this.l = l;
	}
	public void display() {
		for(T e: l) {
			System.out.println(e);
		}
	}
}