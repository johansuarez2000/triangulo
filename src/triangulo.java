/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class triangulo {
    private vertice v1;
    private vertice v2;
    private vertice v3;
    private color linea;
    private color fondo;


    public triangulo(vertice v1, vertice v2, vertice v3, color linea, color fondo) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.linea = linea;
        this.fondo = fondo;
    }
    

  
    public vertice getV1() {
        return v1;
    }

    public void setV1(vertice v1) {
        this.v1 = v1;
    }

    public vertice getV2() {
        return v2;
    }

    public void setV2(vertice v2) {
        this.v2 = v2;
    }

    public vertice getV3() {
        return v3;
    }

    public void setV3(vertice v3) {
        this.v3 = v3;
    }

    public color getLinea() {
        return linea;
    }

    public void setLinea(color linea) {
        this.linea = linea;
    }

    public color getFondo() {
        return fondo;
    }

    public void setFondo(color fondo) {
        this.fondo = fondo;
    }
    public double area( ){
        this.v1.getX();
        this.v2.getX();
        this.v2.getY();
        this.v2.getY();
    return Math.sqrt(Math.pow(v1.getX(),v2.getY())+ Math.pow(v1.getY(),v2.getY()));
                
        
    }
}
