import static java.lang.IO.*;

void main() {
    int cont = 10;
    double soma = 0;
    float n = 0;


    while (cont >= 1) {

        IO.println("Digite um numero: ");
        n = Float.parseFloat(readln());
        cont--;
        soma = soma + n;

    }
    IO.println("A soma total é: " + soma);


}