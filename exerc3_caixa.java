import java.util.Scanner;

void main() {
    Scanner entrada = new Scanner(System.in);
    double total = 0;


    for (double preco = 1; preco > 0; ) {
        System.out.print("Valor do produto: ");
        preco = entrada.nextDouble();

        if (preco > 0) {
            total = total + preco;
        }
    }

    System.out.println("Valor total: R$ " + total);
}