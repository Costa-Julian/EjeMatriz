package com.costa.challengeMatriz.service;



import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

@Service
public class MethodsService {



    public int[][] ordenar(int[][] matriz) {

        int fila = matriz.length;
        int colum = matriz[0].length;
        int totalCount = fila * colum;

        boolean band = false;
        for (int i = 0; !band; i++) {
            band = true;

            for (int j = 1; j < totalCount - i; j++) {
                int currentRow = (j - 1) / colum;
                int currentOffset = (j - 1) % colum;
                int nextRow = j / colum;
                int nextOffset = j % colum;

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


    public String busqueda(int lista[][], int[] vector){
        String resultado = "No encontrado";
        int filas = 0;
        while (filas < lista.length ) {
            int columnas = 0;
            while (columnas < lista[filas].length) {
                if (columnas + 3 < lista[filas].length &&
                        lista[filas][columnas] == vector[0] &&
                        lista[filas][columnas + 1] == vector[1] &&
                        lista[filas][columnas + 2] == vector[2] &&
                        lista[filas][columnas + 3] == vector[3])
                    resultado = "lineal";
                else if(filas + 3 < lista.length &&
                        lista[filas][columnas] == vector[0] &&
                        lista[filas + 1][columnas] == vector[1] &&
                        lista[filas + 2 ][columnas] == vector[2] &&
                        lista[filas + 3][columnas] == vector[3]){
                    resultado = "vertical";
                }else if(filas + 3 <lista.length && columnas + 3 <lista[filas].length &&
                        lista[filas][columnas] == vector[0] &&
                        lista[filas + 1][columnas +1] == vector[1] &&
                        lista[filas + 2 ][columnas +2] == vector[2] &&
                        lista[filas + 3][columnas + 3] == vector[3]){
                    resultado = "diagonal izq-der";
                }else if (filas + 3 <lista.length && columnas + 3 <lista[filas].length &&
                        lista[filas][columnas + 3] == vector[0] &&
                        lista[filas + 1][columnas + 2] == vector[1] &&
                        lista[filas + 2][columnas + 1] == vector[2] &&
                        lista[filas + 3][columnas] == vector[3]){
                    resultado = "diagonal der-izq";
                }
                columnas++;
            }
            filas++;
        }
        return "encontradas: " + resultado;
    }


}
