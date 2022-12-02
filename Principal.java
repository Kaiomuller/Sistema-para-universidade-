import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            int tamanho;
            System.out.println("Qual a quantidade de universidade: ");
            tamanho = leia.nextInt();

            Universidade[] universidades = new Universidade[tamanho];

            int quantidadeAluno, quantidadeProfessor;
            double valorMensalidade;
            String nome, estado, cidade;
            int opcao = 0;
            // instanciando os valores fora do laco de repeticao para ficar organizado e
            // tambem para dar menos problema
            // na hora do laco comecar a fazer a repeticao

            for (int i = 0; i < universidades.length; i++) {
                System.out.println("-- Digite a universidade desejada --");
                System.out.println("1- Universidade: ");
                System.out.println("2- Universidade Publica: ");
                System.out.println("3- Universidade Privada: ");
                tamanho = leia.nextInt();
                // Colocando menu acima para o usuario escolher a universidade plublica ou
                // privada

                System.out.println("Digite seu nome: ");
                nome = leia.nextLine();
                System.out.println("Digite a quantidade de alunos: ");
                quantidadeAluno = leia.nextInt();
                System.out.println("Digite a cidade da univercidade: ");
                cidade = leia.nextLine();
                System.out.println("Digite o estado da universidade: ");
                estado = leia.nextLine();
                System.out.println("Digite a quantidade de professores: ");
                quantidadeProfessor = leia.nextInt();
                // escolhendo a universidade ira aparecer a essa ficha para colocar os dados

                switch (opcao) {
                    case 1:
                        universidades[i] = new Universidade(nome, quantidadeAluno, quantidadeProfessor);
                        break;
                    case 2:
                        universidades[i] = new Publica(nome, quantidadeAluno, quantidadeProfessor, estado, cidade);
                        System.out.println("Digite o estado da universidade: ");
                        estado = leia.nextLine();
                        ((Publica) universidades[i]).setEstado(estado);
                        break;
                    case 3:
                        universidades[i] = new Privada(nome, quantidadeAluno, quantidadeProfessor);
                        System.out.println("Digite a mesalidade da universidade: ");
                        valorMensalidade = leia.nextDouble();
                        ((Privada) universidades[i]).setValorMensalidade(valorMensalidade);
                        break;
                    default:
                        System.out.println("opcao invalida: ");
                }
            }
            // aqui chamado a classe mec para exibir as dados
            Mec obj = new Mec();
            obj.exibeDadosArray(universidades);
            System.out.println("");
            obj.exibeDadosArrayMesalidade((Privada[]) universidades);
            System.out.println("");
            obj.universidadesDoSul((Publica[]) universidades);
            System.out.println("");
        }
    }
}
