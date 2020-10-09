package com.costa.challengeMatriz.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MethodsServiceTest {
    @Autowired
    MethodsService service;


    @Test
    void maxTest(){
        int [][] lista={{1,2,3,4},{5,6,7,8}};
        int max = 8;
        Assertions.assertEquals(max,service.max(lista));
    }
    @Test
    void minTest(){
        int [][] lista={{1,2,3,4},{5,6,7,8}};
        int min = 1;
        Assertions.assertEquals(min,service.min(lista));
    }
    @Test
   void busquedaLinealTrue(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {1,6,8,1};
        String resultado = "encontradas: lineal";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
   }
    @Test
    void busquedaLinealFalse(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {0,0,0,0};
        String resultado = "encontradas: No encontrado";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }
    @Test
    void busquedaVerticalTrue(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {1,3,1,4};
        String resultado = "encontradas: vertical";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }
    @Test
    void busquedaVerticalFalse(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {0,0,0,0};
        String resultado = "encontradas: No encontrado";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }
    @Test
    void busquedaIzqDerTrue(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {1,8,6,1};
        String resultado = "encontradas: diagonal izq-der";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }
    @Test
    void busquedaIzqDerFalse(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {0,0,0,0};
        String resultado = "encontradas: No encontrado";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }
    @Test
    void busquedaDerIzqTrue(){
        int [][] lista={{1,6,8,1},{3,8,8,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {1,8,3,4};
        String resultado = "encontradas: diagonal der-izq";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }
    @Test
    void busquedaDerIzqFalse(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {0,0,0,0};
        String resultado = "encontradas: No encontrado";
        Assertions.assertEquals(resultado,service.busqueda(lista,lista2));
    }

    @Test
    void ordenarTestTrue(){
        int[][] lista = {{3,2,1,4},{6,5,8,7}};
        int[][] retorno ={{1,2,3,4},{5,6,7,8}};
        Assertions.assertArrayEquals(retorno,service.ordenar(lista));
    }
    @Test
    void ordenarTestFalse(){
        int[][] lista = {{3,2,1,4},{6,5,8,7}};
        int[][] retorno = {{3,2,1,4},{6,5,8,7}};
        Assertions.assertTrue(retorno != service.ordenar(lista));
    }
}

