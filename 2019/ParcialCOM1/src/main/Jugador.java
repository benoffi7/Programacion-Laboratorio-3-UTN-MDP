package main;

public class Jugador extends MiembroPlantel
{
	private int cantidadVictorias;
	private String nickname;
	
	public Jugador() {
		super();
		cantidadVictorias = 0;
		nickname = "";
	}

	public Jugador(String nombre, String apellido, String edad, String localidad,
			int cantVictorias, String nickname) {
		super(nombre, apellido, edad, localidad);
		cantidadVictorias = cantVictorias;
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " "+getNickname();
	}
	
	@Override
	public String estoyConcentrar() {
		// TODO Auto-generated method stub
		return "Soy un jugador "+super.estoyConcentrar();
	}
	
	@Override
	public String estoyViajando() {
		// TODO Auto-generated method stub
		return "Soy un jugador "+super.estoyViajando();
	}
	
	public String participar()
	{
		return "Estoy tirando tiritos";
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj!=null)
		{
			if (obj instanceof Jugador)
			{
				Jugador jugador = (Jugador)obj;
				if (jugador.getNickname().equals(getNickname()))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setCantidadVictorias(int cantidadVictorias) {
		this.cantidadVictorias = cantidadVictorias;
	}

	public Jugador (Jugador jugador, String otroNickname)
	{
		super(jugador.getNombre(),jugador.getApellido(),jugador.getEdad(),jugador.getLocalidad());
		nickname = otroNickname;
		cantidadVictorias = jugador.getCantidadVictorias();
	}
	
	public int getCantidadVictorias() {
		return cantidadVictorias;
	}
	
	
	

}
