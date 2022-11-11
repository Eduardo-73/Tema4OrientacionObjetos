/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Cajas;

/**
 *
 * @author eduardo
 */
//Actividad Nº7
public class CajasCarton {

    private String ancho;
    private String alto;
    private String largo;
    private String peso;

    //Constructor
    public CajasCarton(String ancho, String alto, String largo, String peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;

    }

    //Métodos Get y Set
    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    //Métodos abrir y cerra que no devulven nada
    public void Abrir() {

    }

    public void Cerrar() {

    }

    @Override
    public String toString() {
        return "CajasCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }

}
