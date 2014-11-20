/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicai;

import java.util.*;

/**
 *
 * @author ElbaGenao
 */
public abstract class capas {
    public int nivelCapa;
    public float ancho;
    public float altura;
    public Imagen imagen;
    
    public capas (int nivelCapa, float ancho, float altura, Imagen imagen)
    {
        this.nivelCapa = nivelCapa;
        this.ancho = ancho;
        this.altura = altura;
        this.imagen = imagen;

    }
        
    abstract public void agregar(capas c);
    abstract public void eliminar(capas c);
    abstract public void mostrar(int nivelCapa);
}
