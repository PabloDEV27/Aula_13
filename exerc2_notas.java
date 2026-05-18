import static java.lang.IO.*;

void main() {
    Scanner leitor = new Scanner(System.in);

    // Repetição dos 4 alunos
    for (int i = 1; i <= 4; i++) {
        System.out.println("- Aluno " + i + " -");

        double soma = 0;

        // Repetição das 4 notas de cada aluno
        for (int j = 1; j <= 4; j++) {
            System.out.print("Digite a nota " + j + ": ");
            soma += leitor.nextDouble();
        }

        double mf = soma / 4;
        System.out.printf("Média Final: %.2f %n", mf);

        // Resultado de acordo com a média
        if (mf >= 7) {
            System.out.println("Situação: APROVADO");
        } else if (mf >= 5) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        System.out.println("____________________________\n");
    }

}