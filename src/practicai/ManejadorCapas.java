package practicai;

import java.util.ArrayList;
import java.util.List;

public class ManejadorCapas extends capas {
    ArrayList<capas> hijo = new ArrayList<capas>();

    public ManejadorCapas(int nivelCapa, float ancho, float altura, Imagen imagen){
        super(nivelCapa, ancho, altura, imagen);
    }  
    
     @Override
	public void agregar(capas capa)
	{
		hijo.add(capa);
	}
	@Override
	public void eliminar(capas capa)
	{
		hijo.remove(capa);
	}
	@Override
	public void mostrar(int nivelCapa)
	{
		System.out.println(" nivel: " + nivelCapa);
		for (int i = 0; i < hijo.size(); i++)
			hijo.get(i).mostrar(nivelCapa + 1);
	}
}
