package com.costa.challengeMatriz.returns;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReturnsMatrix {

    public int valorMaximo;
    public int valorMinimo;
    public String ocurrencias;
    public int[][] orden;

    public ReturnsMatrix(){}

    public ReturnsMatrix(int valorMaximo, int valorMinimo, String ocurrencias, int[][] orden) {
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
        this.ocurrencias = ocurrencias;
        this.orden = orden;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int[][] getOrden() {
        return orden;
    }

    public void setOrden(int[][] orden) {
        this.orden = orden;
    }

    public String getOcurrencias() {
        return ocurrencias;
    }

    public void setOcurrencias(String ocurrencias) {
        this.ocurrencias = ocurrencias;
    }
}
