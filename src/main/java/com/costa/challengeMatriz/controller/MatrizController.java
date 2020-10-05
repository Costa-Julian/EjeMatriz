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
        int[] vector = {12,25,37,41};
        return new ReturnsMatriz(metodos.max(matriz), metodos.min(matriz),metodos.existeLineal(matriz, vector),
                metodos.existeVertical(matriz,vector),metodos.diagonalIzquierda(matriz,vector),
                metodos.diagonalDerecha(matriz,vector),metodos.ordenar(matriz));
    }


}
