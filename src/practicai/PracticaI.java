/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicai;

/**
 *
 * @author ElbaGenao
 */
public class PracticaI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imagen img =  new Imagen(2, 5, null);
        ManejadorCapas capa1 = new ManejadorCapas(1, 5, 5, img);
        ManejadorCapas capa2 = new ManejadorCapas(2, 6, 9, img);
        ManejadorCapas capa3 = new ManejadorCapas(4, 5, 9, img);
        
        capa1.agregar(capa2);
        capa2.agregar(capa3);
        
        ManejadorCapas capa4 = new ManejadorCapas(4, 15, 19, img);
        capa3.agregar(capa4);
        
        
    }
    
}
