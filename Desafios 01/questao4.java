public class questao4 {
    public static void main(String[] args) {
        int x[] = {14,123,10,-25,32};
        quest4(5, x);
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
