package genericos_com2;

public class Mapa<K,V,S,U> //defino muchos tipos de clase separando por comas
{
	private K unaVariable;
	private V otraVariable;
	private S otraOtraVariable;
	private U otraOtraOtraVariable;
	
	
	public Mapa(K unaVariable, V otraVariable, S otraOtraVariable, U otraOtraOtraVariable) {
		this.unaVariable = unaVariable;
		this.otraVariable = otraVariable;
		this.otraOtraVariable = otraOtraVariable;
		this.otraOtraOtraVariable = otraOtraOtraVariable;
	}
	public K getUnaVariable() {
		return unaVariable;
	}
	public void setUnaVariable(K unaVariable) {
		this.unaVariable = unaVariable;
	}
	public V getOtraVariable() {
		return otraVariable;
	}
	public void setOtraVariable(V otraVariable) {
		this.otraVariable = otraVariable;
	}
	public S getOtraOtraVariable() {
		return otraOtraVariable;
	}
	public void setOtraOtraVariable(S otraOtraVariable) {
		this.otraOtraVariable = otraOtraVariable;
	}
	public U getOtraOtraOtraVariable() {
		return otraOtraOtraVariable;
	}
	public void setOtraOtraOtraVariable(U otraOtraOtraVariable) {
		this.otraOtraOtraVariable = otraOtraOtraVariable;
	}
	
	
	
	
}
