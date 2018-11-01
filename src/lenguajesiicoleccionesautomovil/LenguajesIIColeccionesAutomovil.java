/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajesiicoleccionesautomovil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import objetos.Automovil;

/**
 *
 * @author s207e16
 */
public class LenguajesIIColeccionesAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Automovil> arrayCarros = new ArrayList<>();
        arrayCarros.add(new Automovil("BXB906","323","Mazda"));
        arrayCarros.add(new Automovil("BXW110","3","Mazda"));
        arrayCarros.add(new Automovil("EVX877","2","Mazda"));
        arrayCarros.add(new Automovil("EKN396","6","Mazda"));
        //arrayCarros.add("Holi"); //Genera el error porque este tipo de ArrayList sólo recibe objetos de tipo Automovil.
        
        for (Automovil objCarro : arrayCarros) {
            Automovil a = (Automovil)objCarro;
            System.out.println("Marca: "+a.getMarca()+", Modelo: "+a.getModelo()+", Placa: "+a.getPlaca());
        }

        
    }
    
}
