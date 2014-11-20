/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicai;

import java.io.File;

/**
 *
 * @author ElbaGenao
 */
public class Imagen {
    private float ancho;
    private float altura;
    private File archivo;
    public Imagen(float ancho, float altura, File archivo){
        this.altura = altura;
        this.ancho = ancho;
        this.archivo = archivo;
    }
}
