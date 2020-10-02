package com.costa.challengeMatriz.controllers;

import com.costa.challengeMatriz.controller.MatrizController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MatrizControllerTests {

  @Autowired
  MatrizController matrizController;

	@Test
	void testMetodo1True() {
    Assert.assertEquals( true, matrizController.metodo1("hola mundo"));
	}

  @Test
  void testMetodo1False() {
    Assert.assertEquals( false, matrizController.metodo1("hola mundo2"));
  }

  @Test
  void testListaTrue() {
	  String response = "{\"content\":\"true\"}";
    Assert.assertEquals( response, matrizController.lista("hola mundo"));
  }

  @Test
  void testListaFalse() {
    String response = "{\"content\":\"false\"}";
    Assert.assertEquals( response, matrizController.lista("hola mundo2"));
  }

  void testPing() {
    Assert.assertEquals( "pong", matrizController.ping());
  }

  @Test
  void testListaFalse() {
	  int[][] matrizRequest = [1][2][3][4]
    int[][] matrizResponse =[1][2][3][4]

    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        Assert.assertTrue(matrizRequest[i][j] == matrizResponse[i][j]);
      }
    }
  }
}
