import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        long tempo_inicial = System.currentTimeMillis();
        mostrar_divisores(numero);
        long tempo_final = System.currentTimeMillis();
        System.out.println("Tempo em milessegundos: " + (tempo_final - tempo_inicial));
        System.out.printf("Tempo em segundos: " + ((tempo_final - tempo_inicial)*0.001));
    }
    public static void mostrar_divisores(int numero){
        System.out.println("1");
        if(numero%2 == 0){
            System.out.println("2");
            for(int i = 3; i <= numero/2; i++){
                if(numero%i == 0 ){
                    System.out.println(i);
                }
            }
        }
        else{
            for(int i = 3; i < numero/2; i+=2){
                if(numero%i == 0 ){
                    System.out.println(i);
                }
            }
        }
        System.out.println(numero);
    }
}
