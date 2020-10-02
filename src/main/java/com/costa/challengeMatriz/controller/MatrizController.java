package com.costa.challengeMatriz.controller;

import com.costa.challengeMatriz.returns.ReturnsMatriz;
import com.costa.challengeMatriz.service.MethodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class MatrizController {

    @Autowired
    public MethodsService metodos;

    @GetMapping ("ping")
    public String ping(){
        return "pong";
    }

    @PostMapping(value = "lista", consumes = "application/json")
    public ReturnsMatriz lista (@RequestBody int[][] matriz){
        return new ReturnsMatriz(metodos.max(matriz), metodos.min(matriz), metodos.ordenar(matriz));
    }


  @PostMapping(value = "prueba1", consumes = "application/json")
  public String lista (@RequestBody String variable){
     return "{\"content\":\"" + metodo1(variable) + "\"}";
  }

  public Boolean metodo1(String variable){
      return variable.equals("hola mundo");
  }
}
