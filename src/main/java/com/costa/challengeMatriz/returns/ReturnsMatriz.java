package com.costa.challengeMatriz.returns;


public class ReturnsMatriz  {

    public int valorMaximo;
    public int valorMinimo;
    public int[][] orden;

    public ReturnsMatriz(){}

    public ReturnsMatriz(int valorMaximo, int valorMinimo, int[][] orden) {
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
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
}
