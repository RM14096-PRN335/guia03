
   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
public class UtilitiesTest {

    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class).addClass(Utilities.class).addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }

    @Inject
    private Utilities utilities;

    @Test
    public void probarMetodogetResume() {
        String fraseEsperada = "bienvenidos a la mat";
        String fraseCompleta = "bienvenidos a la materia de programacion";
        String resultado = utilities.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);
    }
   @Test
    public void probargetResumen(){
          String fraseEsperada = "Hola​ Mundo!";
        String fraseCompleta = "Hola​ Mundo!";
        String resultado = utilities.getResume(fraseCompleta);
        Assert.assertEquals(fraseEsperada, resultado);

        
        
    } 
    
    @Test
    public void probarMetodoCapitalizar() {
       
        String fraseEsperada2 = "Pruebas De Unidad Con Unit & Arquillian";
       
        
        String texto="pruebas de unidad con unit & arquillian";
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
   @Test
    public void probarrMetodoCapitalizar(){
        String fraseEsperada2 = "";
        String texto="";
        String resultado = utilities.capitalizar(texto);
        Assert.assertEquals(fraseEsperada2, resultado);

        
        
    }
    
       @Test
    public void probarMetodoContar() {
        int fraseEsperada3= 1;
        String frase="2017";
       
        String Cadena = "Bienvenidos a la materia de programacion 3 del ciclo II 2017";
        
        int resultado = utilities.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(fraseEsperada3, resultado);
    }
   @Test
    public void probarMetodoContarr(){
         int fraseEsperada3= 2;
        String frase="ma";
       
        String Cadena = "Bienvenidos a la materia de programacion 3 ciclo II 2017";
        
        int resultado = utilities.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(fraseEsperada3, resultado);
     
    }
    /*@Test
    public void probarMetodoContas(){
          int fraseEsperada3= 0;
        String frase="bienvenido";
        String Cadena = null;
        int resultado = utilities.contarCoincidencias(Cadena, frase);
        Assert.assertEquals(fraseEsperada3, resultado);*/
        
    }
  
   
    




  