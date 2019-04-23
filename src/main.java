/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class main {
    public static void main (String[] args){
    color fondo = new color(10,10,20);
    color linea = new color(20,30,50);
    vertice v1= new vertice(10,10);
    vertice v2= new vertice(50,20);
    vertice v3= new vertice(20,30);
    triangulo t= new triangulo(v1 ,v2 ,v2 ,linea ,fondo); 
    System.out.println(t.area());
}
    
}
