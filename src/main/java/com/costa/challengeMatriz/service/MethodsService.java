package com.costa.challengeMatriz.service;



import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

@Service
public class MethodsService {



    public int[][] ordenar(int[][] matriz) {

        int row = matriz.length;
        int col = matriz[0].length;
        int totalCount = row * col;

        boolean band = false;
        for (int i = 0; !band; i++) {
            band = true;

            for (int j = 1; j < totalCount - i; j++) {
                int currentRow = (j - 1) / col;
                int currentOffset = (j - 1) % col;
                int nextRow = j / col;
                int nextOffset = j % col;

                if (matriz[currentRow][currentOffset] > matriz[nextRow][nextOffset]) {

                    int temp = matriz[nextRow][nextOffset];
                    matriz[nextRow][nextOffset] = matriz[currentRow][currentOffset];
                    matriz[currentRow][currentOffset] = temp;

                    band = false;
                }
            }
        }

        return matriz;
    }

    @Deprecated
    public Integer maximo(Integer[][] matriz){
        Integer num = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if ( matriz[i][j] > num){
                    num = matriz[i][j];
                }
            }
        }
        return num;
    }
    @Deprecated
    public Integer minimo(int[][] matriz){
        Integer num = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if ( matriz[i][j] < num){
                    num = matriz[i][j];
                }
            }
        }
        return num;
    }

    public int min(int[][] x){
        return Arrays.stream(x)
                .flatMapToInt(IntStream::of)
                .min()
                .getAsInt();
    }

    public int max(int[][] x){

        return Arrays
                .stream(x)
                .flatMapToInt(IntStream::of)
                .max()
                .getAsInt();
    }


    public boolean existeLineal(int lista[][], int[] vector){
        boolean band = false;
        try {
            for (int filas = 0; filas < lista.length; filas++) {
                for (int columnas = 0; columnas < lista[filas].length; columnas++) {
                    if (
                            (band == false) && (lista[filas][columnas] == vector[0])
                                    && (lista[filas][columnas + 1] == vector[1])
                                    && (lista[filas][columnas + 2] == vector[2])
                                    && (lista[filas][columnas + 3] == vector[3])){

                        band = true;}
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            band = false;
        }
        return band;
    }
    public boolean existeVertical(int lista[][], int[] vector ){
        boolean band = false;
        try {
            for (int filas = 0; filas < lista.length; filas++) {
                for (int columnas = 0; columnas < lista[filas].length; columnas++) {
                    if (
                            (band == false) && (lista[filas][columnas] == vector[0])
                                    && (lista[filas + 1][columnas] == vector[1])
                                    && (lista[filas + 2 ][columnas] == vector[2])
                                    && (lista[filas + 3][columnas] == vector[3])){
                        band = true;}
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            band = false;
        }
        return band;

    }

    public boolean diagonalIzquierda(int lista[][], int[] vector) {
        int[] listado = vector;
        boolean band = false;
        try {
            for (int filas = 0; filas < lista.length; filas++) {
                for (int columnas = 0; columnas < lista[filas].length; columnas++) {
                    if (
                            (band == false) && (lista[filas][columnas] == vector[0])
                                    && (lista[filas + 1][columnas +1] == vector[1])
                                    && (lista[filas + 2 ][columnas +2] == vector[2])
                                    && (lista[filas + 3][columnas + 3] == vector[3]))
                        band = true;
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            band = false;
        }
        return band;
    }

    public boolean diagonalDerecha(int lista[][], int[] vector) {
        boolean band = false;
        try {
            for (int filas = 0; filas < lista.length; filas++) {
                for (int columnas = 0; columnas < lista[filas].length; columnas++) {
                    if ((band == false) && (lista[filas][columnas + 3] == vector[0])
                            && (lista[filas + 1][columnas + 2] == vector[1])
                            && (lista[filas + 2][columnas + 1] == vector[2])
                            && (lista[filas + 3][columnas] == vector[3]))
                        band = true;
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            band = false;
        }

        return band;
    }

}
