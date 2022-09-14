public class Questao1 {
    public static void main(String[] args) {
        quest1(10);
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
}
