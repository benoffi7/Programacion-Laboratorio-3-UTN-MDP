package app;

public class Pareja <K,V> 
{
	K t1;
	V t2;
	
	
	public Pareja(K t1, V t2) {
		
		this.t1 = t1;
		this.t2 = t2;
	}
	public K getT1() {
		return t1;
	}
	public void setT1(K t1) {
		this.t1 = t1;
	}
	public V getT2() {
		return t2;
	}
	public void setT2(V t2) {
		this.t2 = t2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return t1.toString() + t2.toString();
	}
	

}
