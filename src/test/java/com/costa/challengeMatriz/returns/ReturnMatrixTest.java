package com.costa.challengeMatriz.returns;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ReturnMatrixTest {
    @Autowired
    ReturnsMatrix returnsMatrix;
    @Test
    void getAndSetValorMaximoTest(){
        returnsMatrix.setValorMaximo(10);
        int valor = 10;
        Assertions.assertEquals(valor,returnsMatrix.getValorMaximo());
    }
    @Test
    void getAndSetValorMinimoTest(){
        returnsMatrix.setValorMinimo(0);
        int valor = 0;
        Assertions.assertEquals(valor,returnsMatrix.getValorMinimo());
    }
    @Test
    void getAndSetOrdenTest(){
        int [][] lista={{1,6,8,1},{3,8,2,2},{1,3,6,3},{4,6,2,1}};
        returnsMatrix.setOrden(lista);
        int[][] valor = lista;
        Assertions.assertEquals(valor,returnsMatrix.getOrden());
    }
    @Test
    void getAndSetOcurrenciasTest(){
        String test = "Hola mundo";
        returnsMatrix.setOcurrencias(test);
        Assertions.assertEquals(test,returnsMatrix.getOcurrencias());
    }
    @AfterAll
    void afterAll(){
    returnsMatrix.setValorMinimo(0);
    returnsMatrix.setValorMaximo(0);
    returnsMatrix.setOrden(null);
    returnsMatrix.setOcurrencias(null);
    }
}
