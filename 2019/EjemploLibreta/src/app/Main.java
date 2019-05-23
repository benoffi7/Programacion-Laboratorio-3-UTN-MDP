package app;

public class Main {

	public static void main(String[] args) {
		
		LibretaDeDirecciones deDirecciones = new LibretaDeDirecciones();
		deDirecciones.agregar(new DatosContacto("gonzalo", "123"));
		deDirecciones.agregar(new DatosContacto("paz", "456"));
		deDirecciones.agregar(new DatosContacto("gaston", "789"));
		
		System.out.println(deDirecciones.cantidad());
		
		DatosContacto contacto;

		
			try {
				contacto = deDirecciones.getContactoV2("paz");
				System.out.println(contacto.getNombre());
			} 
			catch (ClaveNoExisteExcecption e) {
				System.out.println(e.getMessage());
				
			} catch (ClaveVaciaExcecption e) {
				System.out.println("clave vacia");
				
			}	
			finally
			{
				System.out.println("finally");
			}
			
		
		
		
			
		
		/*
		
		if (deDirecciones.existeClave("ale"))
		{
			
		}
		else
		{
			System.out.println("no existe");
		}
		
		contacto = deDirecciones.getContacto("ale");
		if (contacto!=null)
					System.out.println(contacto.getNombre());
					*/
		
		/*
		deDirecciones.eliminarContacto("gonzalo");
		deDirecciones.eliminarContacto("ale");
		
		System.out.println(deDirecciones.cantidad());*/

	}

}
