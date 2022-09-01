public class fatorial {
    public static void main(String[] args){
        long tempo_inicial = System.currentTimeMillis();
        System.out.println(fatorial(5));
        long tempo_final = System.currentTimeMillis();
        System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));
        System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));
        // long tempo_inicial = System.currentTimeMillis();
        // quest1(4);
        // long tempo_final = System.currentTimeMillis();
        // System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));
        // System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));
    }
    static int fatorial(int n){
        if (n == 0 || n == 1)
            return 1;
        return n*fatorial(n-1);
    }
    static void quest1(long N){
        long rs = 1;
        while(N > 0){   
            rs = rs * N;
            N--;
        }
        System.out.println(rs);
    }
}

