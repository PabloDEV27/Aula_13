import static java.lang.IO.*;

void main() {
    int Joao = 0;
    int Maria = 0;
    int Nulos = 0;

    println("----------------VOTAÇÃO----------------");
    println("vote: 0 = nulo ou 1 = João ou 2 = Maria");

    for(int i = 1; i <= 10; i++){
        print("Voto " + i + " : ");
        int voto = Integer.parseInt(readln());

        switch (voto) {
            case 1:
                Joao++;
                break;
            case 2:
                Maria++;
                break;
            case 0:
                Nulos++;
                break;
        }
    }
    if(Maria > Joao){
        println("Maria ganhou a eleição!");
    }else if(Joao > Maria){
        println("João ganhou a eleição!");
    }else
        println("Empate na eleição!");
}