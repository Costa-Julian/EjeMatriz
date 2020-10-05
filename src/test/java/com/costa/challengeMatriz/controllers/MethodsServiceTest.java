package com.costa.challengeMatriz.controllers;

import com.costa.challengeMatriz.service.MethodsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
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
    void existeLinealTrue (){
        int [][] lista={{1,2,3,4},{1,6,5,2},{3,2,4,3},{5,6,2,4}};
        int[] lista2 = {5,6,2,4};
        Assertions.assertTrue(service.existeLineal(lista,lista2));
    }
    @Test
    void existeLinealFalse (){
        int [][] lista={{1,2,3,4},{1,6,5,2},{3,2,4,3},{5,6,2,4}};
        int[] lista2 = {0,0,0,0};
        Assertions.assertFalse(service.existeLineal(lista,lista2));
    }
    @Test
    void existeVerticalTrue() {
        int [][] lista={{1,2,3,4},{2,6,5,2},{3,2,4,3},{4,6,2,4}};
        int[] lista2 = {1,2,3,4};
        Assertions.assertTrue(service.existeVertical(lista,lista2));
    }
    @Test
    void existeVerticalFalse() {
        int [][] lista={{1,2,3,4},{2,6,5,2},{3,2,4,3},{4,6,2,4}};
        int[] lista2 = {0,0,0,0};
        Assertions.assertFalse(service.existeVertical(lista,lista2));
    }
    @Test
    void existeDiagonalIzquierdatrue() {
        int [][] lista={{1,6,8,4},{3,2,5,2},{3,5,3,3},{4,6,2,4}};
        int[] lista2 = {1,2,3,4};
        Assertions.assertTrue(service.diagonalIzquierda(lista,lista2));
    }
    @Test
    void existeDiagonalIzquierdaFalse() {
        int [][] lista={{1,6,8,4},{3,2,5,2},{3,5,3,3},{4,6,2,4}};
        int[] lista2 = {0,0,0,0};
        Assertions.assertFalse(service.diagonalIzquierda(lista,lista2));
    }
    @Test
    void existeDiagonalDerechaTrue() {
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {1,2,3,4};
        Assertions.assertTrue(service.diagonalDerecha(lista,lista2));
    }
    @Test
    void existeDiagonalDerechaFalse() {
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        int[] lista2 = {0,0,0,0};
        Assertions.assertFalse(service.diagonalDerecha(lista,lista2));
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

