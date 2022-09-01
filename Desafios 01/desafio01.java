import java.util.Scanner;
public class desafio01 {
    public static void main(String[] args) {
        // int x[] = {14,123,10,-25,32};
        // quest1(10);
        // quest2(6);
        // quest3(10000);
        // quest4(5, x);
    }
    static void quest1(long N){
        long tempo_inicial = System.currentTimeMillis();
        long rs = 1;
        while(N > 0){   
            rs = rs * N;
            N--;
        }
        long tempo_final = System.currentTimeMillis();
        System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));
        System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));
        System.out.println(rs);
    }
    static void quest2(int N){
        int i;
        for(i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }
    }
    static void quest3(int N){
        long tempo_inicial = System.currentTimeMillis();
        int i;
        for(i = 1; i <= N; i++){
            System.out.println(i +" "+ i*i +" " + i*i*i);
        }
        long tempo_final = System.currentTimeMillis();
        System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));
        System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));
    }
    static void quest4(int N, int x[]){
        long tempo_inicial = System.currentTimeMillis();
        int in = 0, out = 0;
        for (int i = 0; i < N; i++) {
            if (x[i] >= 10 && x[i] <= 20) {
                in++;
            } else out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        long tempo_final = System.currentTimeMillis();
        System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));
        System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));
    }
}

