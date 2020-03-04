/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author Libny Zambrano
 */
public class Modulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Circulo circulo = new Circulo();
        Linea linea = new Linea ();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println("Formas");
        System.out.println();
        circulo.ImprimirFormas();
        linea.ImprimirFormas();
        triangulo.ImprimirFormas();
        cuadrado.ImprimirFormas();
        
    }
    }
    

