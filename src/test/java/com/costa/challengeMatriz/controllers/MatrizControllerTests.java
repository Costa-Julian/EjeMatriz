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
  void testPing() {
    Assert.assertEquals( "pong", matrizController.ping());
  }


}
