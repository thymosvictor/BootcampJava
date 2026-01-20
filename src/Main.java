import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Listas e Scanner para input// Se eu preciso guardar vários itens → uso lista.
    static ArrayList<Ingresso> ingressos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        //Do - While: Mantém o sistema rodando até o usuário sair.//
        do {
            System.out.println("1 - Criar ingresso");
            System.out.println("2 - Listar ingressos");
            System.out.println("3 - Atualizar ingresso");
            System.out.println("4 - Excluir ingresso");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            //Menu + switch//
            switch (opcao) {
                case 1:
                    criarIngresso();
                    break;
                case 2:
                    listarIngressos();
                    break;
                case 3:
                    atualizarIngresso();
                    break;
                case 4:
                    excluirIngresso();
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break; }
            } while (opcao != 5);
    }

    // Criar objeto
    static void criarIngresso() {
        System.out.print("Nome do comprador: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade de ingressos: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Meia-entrada? (sim/nao): ");
        String resposta = scanner.nextLine().toLowerCase();

        boolean meia;
        if (resposta.equals("sim")) {
            meia = true;
        } else {
            meia = false;
        }

        Ingresso ingresso = new Ingresso(nome, quantidade, meia);
        ingressos.add(ingresso);

        System.out.println("Ingresso criado com sucesso!");
    }

    // Ler o Ingresso
    static void listarIngressos() {
        if (ingressos.isEmpty()) {
            System.out.println("Nenhum ingresso cadastrado.");
            return;
        }

        //Loop para percorrer a lista e mostrar o índice//
        System.out.println("\n=== LISTA DE INGRESSOS ===");
        for (int i = 0; i < ingressos.size(); i++) {
            System.out.println(i + " - " + ingressos.get(i));
        }
    }

    //Atualizar

    // UPDATE
    static void atualizarIngresso() {
        if (ingressos.isEmpty()) {
            System.out.println("Não há ingressos para atualizar.");
            return;
        }

        listarIngressos();

        System.out.print("Informe o índice do ingresso para atualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        if (indice < 0 || indice >= ingressos.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Ingresso ingresso = ingressos.get(indice);

        System.out.print("Novo nome do comprador: ");
        String novoNome = scanner.nextLine();

        System.out.print("Nova quantidade de ingressos: ");
        int novaQuantidade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Meia-entrada? (sim/nao): ");
        String resposta = scanner.nextLine().toLowerCase();
        boolean novaMeia = resposta.equals("sim");

        // Atualizando os dados
        ingresso.setNomeComprador(novoNome);
        ingresso.setQuantidade(novaQuantidade);
        ingresso.setMeiaEntrada(novaMeia);

        System.out.println("Ingresso atualizado com sucesso!");
    }

    // Deletar
    static void excluirIngresso() {
        if (ingressos.isEmpty()) {
            System.out.println("Não há ingressos para excluir.");
            return;
        }

        listarIngressos();

        System.out.print("Informe o índice do ingresso para excluir: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < ingressos.size()) {
            ingressos.remove(indice);
            System.out.println("Ingresso removido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
















//public class Main {
//    public static void main(String[] args) {
//
//        String nome;
//        int quantidade;
//
//
//
//    }












//Sistema de processo seletivo para uma bolsa de estudos
//
//        Scanner input = new Scanner((System.in));
//        System.out.println("Digite seu nome:");
//        String nome = input.next();
//
//        System.out.println("Digite sua idade:");
//        int idade = input.nextInt();
//
//        String cpf ;
//
//        while (true) {
//            System.out.println("Digite seu cpf:");
//            cpf = input.next();
//
//            if (cpf.length() == 11 ) {
//                System.out.println();
//                break;
//            } else {
//                System.out.println("CPF inválido");
//            }
//        }
//
//        System.out.println("Digite sua renda mensal:");
//        float rendaMensal = input.nextFloat();
//
//        if ( rendaMensal > 1500) {
//            System.out.println("Candidato " +nome+ ", infelizmente você não se encaixa nos critérios do nosso processo. Pois sua renda mensal é de " +rendaMensal+ " E para participar do processo, a sua renda mensal não pode ultrapassar R$1.500");
//        } else {
//            System.out.println("Parabéns,candidato(a) " +nome+ " . Você se enacaixa nos critérios do nosso processo!");
//        }
//    }


//
//    public class Candidato {
//        String nome;
//        int idade;
//        float renda;
//    }
//
//}