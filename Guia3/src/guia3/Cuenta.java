package guia3;

public class Cuenta {
	//
	private int id;
	private float balance;
	private Cliente cliente;
	//
	public Cuenta (){
		
	}
	//
	public int getId(){
		return id;
	}
	public void setId(int idR){
		id = idR;
	}
	public float getBalance(){
		return balance;
	}
	public void setBalance(float balanceR){
		balance = balanceR;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(int idR, String nombreR, String generoR){
		cliente = new Cliente(idR,nombreR,generoR);
	}
	
}
