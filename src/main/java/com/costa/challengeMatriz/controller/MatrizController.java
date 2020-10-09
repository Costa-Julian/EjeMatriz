package com.costa.challengeMatriz.controller;

import com.costa.challengeMatriz.returns.ReturnsMatrix;
import com.costa.challengeMatriz.service.MethodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MatrizController {

    @Autowired
    public MethodsService metodos;
    int[] vector = {7,72,51,6};

    @GetMapping ("ping")
    public String ping(){
        return "pong";
    }

    @PostMapping(value = "lista", consumes = "application/json")
    public ReturnsMatrix lista (@RequestBody int[][] matriz){
        return new ReturnsMatrix(metodos.max(matriz),
                metodos.min(matriz),
                metodos.busqueda(matriz,vector),
                metodos.ordenar(matriz));
    }


}
