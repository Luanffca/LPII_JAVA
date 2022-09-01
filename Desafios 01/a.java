import java.util.Scanner;

public class a {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
        long tempo_inicial = System.currentTimeMillis();
		for (int i = 1; i <= N/2; i++) {
			if (N % i == 0) {
				System.out.print(i+"\n");
			}
		}

        long tempo_final = System.currentTimeMillis();

        System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));

        System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));

	}
}