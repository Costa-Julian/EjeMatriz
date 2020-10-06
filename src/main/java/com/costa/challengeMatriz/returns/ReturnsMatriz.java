package com.costa.challengeMatriz.returns;


public class ReturnsMatriz  {

    public int valorMaximo;
    public int valorMinimo;
    public Boolean ejercicioA;
    public Boolean ejercicioB;
    public Boolean ejercicioC;
    public Boolean ejercicioD;
    public int[][] orden;

    public ReturnsMatriz(){}

    public ReturnsMatriz(int valorMaximo, int valorMinimo,
                         Boolean ejercicioA, Boolean ejercicioB,
                         Boolean ejercicioC, Boolean ejercicioD,
                         int[][] orden) {
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
        this.ejercicioA = ejercicioA;
        this.ejercicioB = ejercicioB;
        this.ejercicioC = ejercicioC;
        this.ejercicioD = ejercicioD;
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

  public Boolean getEjercicioA() {
    return ejercicioA;
  }

  public void setEjercicioA(Boolean ejercicioA) {
    this.ejercicioA = ejercicioA;
  }

  public Boolean getEjercicioB() {
    return ejercicioB;
  }

  public void setEjercicioB(Boolean ejercicioB) {
    this.ejercicioB = ejercicioB;
  }

  public Boolean getEjercicioC() {
    return ejercicioC;
  }

  public void setEjercicioC(Boolean ejercicioC) {
    this.ejercicioC = ejercicioC;
  }

  public Boolean getEjercicioD() {
    return ejercicioD;
  }

  public void setEjercicioD(Boolean ejercicioD) {
    this.ejercicioD = ejercicioD;
  }
}
