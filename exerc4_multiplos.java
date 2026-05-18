import static java.lang.IO.*;

void main() {
    IO.println("--- Soma dos múltiplos de três   ---");

    int soma = 0;
    int i = 1;

    do {
        if (i % 3 == 0) {
            System.out.println(i);
            soma = soma + i;
        }
        i++;
    } while (i <= 100); {
        IO.println("A soma é: " + soma);
    }
}