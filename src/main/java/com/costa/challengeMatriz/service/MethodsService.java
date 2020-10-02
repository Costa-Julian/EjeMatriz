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

        boolean noSwaps = false;
        for (int i = 0; !noSwaps; i++) {
            noSwaps = true;

            for (int j = 1; j < totalCount - i; j++) {
                int currentRow = (j - 1) / col;
                int currentOffset = (j - 1) % col;
                int nextRow = j / col;
                int nextOffset = j % col;

                if (matriz[currentRow][currentOffset] > matriz[nextRow][nextOffset]) {

                    int temp = matriz[nextRow][nextOffset];
                    matriz[nextRow][nextOffset] = matriz[currentRow][currentOffset];
                    matriz[currentRow][currentOffset] = temp;

                    noSwaps = false;
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

}
