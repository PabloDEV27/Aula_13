import static java.lang.IO.*;

void main() {

    IO.println("Digite sua senha: ");
    int tent = 0;

    while (tent < 3) {
        String senha = readln();

        if (senha.equals("4321")){
            IO.println("Senha válida");
            return;
        } else{
            IO.println("Senha incorreta");
        }
        tent++;
    }
    IO.println("Conta bloqueada");
}