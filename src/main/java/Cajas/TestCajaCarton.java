/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajas;

/**
 *
 * @author eduardo
 */
//Actividad Nº8
public class TestCajaCarton {
    public static void main(String[] args) {
        
        CajasCarton cajaGrande = new CajasCarton("250mm", "400mm", "500mm", "200gr");
        CajasCarton cajaChica = new CajasCarton("25mm", "30mm", "15mm", "17gr");
        
        System.out.println(cajaGrande);
        System.out.println("---------------");
        System.out.println(cajaChica);
        System.out.println("---------------");
        System.out.println("""
                           El ancho de las cajas grandes es de %s, el alto es de 
                           %s, el largo es de %s y el peso es de %s
                             """.formatted(cajaGrande.getAncho(),cajaGrande.getAlto(),cajaGrande.getLargo(),cajaGrande.getPeso()));
       System.out.println("---------------"); 
       System.out.println("""
                           El ancho de las cajas chicas es de %s, el alto es de 
                           %s, el largo es de %s y el peso es de %s
                             """.formatted(cajaChica.getAncho(),cajaChica.getAlto(),cajaChica.getLargo(),cajaChica.getPeso()));
    }    
}
