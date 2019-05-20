package app;

public class EjemploGenerica <T,K,P>
{
	T atributo;//variables de clases
	
	public EjemploGenerica(T atributo) //parametros  
	{
		T local; //variables locales
		this.atributo = atributo;
	}
	
	public T getAtributo() //retorno
	{
		return atributo;
	}
}
