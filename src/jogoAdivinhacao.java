import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSorteado = new Random().nextInt(100);

        int contador = 0;

        while(contador < 5) {
            System.out.println("Digite um número de 1 a 100: ");
            int numero = sc.nextInt();

            if (numero == numeroSorteado) {
                System.out.printf("Parabéns, você acertou ! O número sorteado é %d !", numeroSorteado);
                break;
            } else if (numero < numeroSorteado) {
                System.out.println("O número sorteado é MAIOR !");
            } else {
                System.out.println("O número sorteado é MENOR !");
            }
            contador++;
        }

        sc.close();
    }
}
