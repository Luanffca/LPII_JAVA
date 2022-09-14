public class Questao3 {
    public static void main(String[] args) {
        // int x[] = {14,123,10,-25,32};
        // quest1(10);
        // quest2(6);
        quest3(5);
        // quest4(5, x);
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
}