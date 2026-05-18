import static java.lang.IO.*;

void main() {
    double saldoinicial = 500.00;

    int opcao;
    do {
        println("-----CAIXA ELETRÔNICO-----");
        println(" - ESCOLHA UMA OPÇÃO - ");
        println("1 - Saque");
        println("2 - Depósito");
        println("3 - Saldo");
        println("0 - Sair");
        opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1:
                print("Digite o valor do saque: R$");
                double valorsaque = Double.parseDouble(readln());

                if (valorsaque > 0 && valorsaque <= saldoinicial) {
                    saldoinicial -= valorsaque;
                    println("Saque realizado com sucesso!");
                } else if (valorsaque > saldoinicial) {
                    println("Saldo insuficiente!");
                } else {
                    println("Valor de saque invalido!");
                }
                break;

            case 2:
                print("Digite o valor do depósito: R$");
                double deposito = Double.parseDouble(readln());

                if (deposito > 0) {
                    saldoinicial += deposito;
                    println("Depósito realizado com sucesso!");
                } else {
                    println("Valor de depósito invalido!");
                }
                break;

            case 3:
                print("Seu saldo atual é: R$" + saldoinicial);
                break;

            case 0:
                println("Obrigado por utilizar nosso caixa eletrônico!");
                break;

            default:
                println("Opção inválida! Tente novamente!");
        }


    } while (opcao != 0);
}