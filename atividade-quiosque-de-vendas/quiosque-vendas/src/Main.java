import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quiosque quiosque = new Quiosque();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                System.out.println("\nEscolha uma opção:");
                System.out.println("Opção 1: Matricula");
                System.out.println("Opção 2: Escolha seu Minicurso");
                System.out.println("Opção 3: Informe o Cartão");
                System.out.println("Opção 4: Finalizar Compra");
                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        if (quiosque.getState() instanceof EstadoEmEspera) {
                            System.out.println("Digite sua matrícula (8 Dig): ");
                            String matricula = scanner.nextLine();
                            quiosque.identificarAluno(matricula);
                        } else {
                            System.out.println("Ação negada");
                        }
                        break;

                    case 2:
                        if (quiosque.getState() instanceof EstadoIdentificado) {
                            System.out.println("Escolha o minicurso (ChatGPT, BlockChain, IoT, Realidade Virtual): ");
                            String minicurso = scanner.nextLine();
                            quiosque.escolherMinicurso(minicurso);
                        } else {
                            System.out.println("Ação negada");
                        }
                        break;

                    case 3:
                        if (quiosque.getState() instanceof EstadoProcessando) {
                            System.out.println("Informe o cartão: ");
                            String cartao = scanner.nextLine();
                            quiosque.informarCartao(cartao);
                        } else {
                            System.out.println("Espere autorização do cartão antes de informar o cartão");
                        }
                        break;

                    case 4:
                        if (quiosque.getState() instanceof EstadoInscrito) {
                            quiosque.finalizar();
                            System.out.println("Operação finalizada. Obrigado!");
                            return;
                        } else {
                            System.out.println("Escolher um mini curso ");
                        }
                        break;
                    default:
                        System.out.println("Escolha uma opção válida.");
                }
            }
            
        } finally {
            scanner.close();
        }
    
    }

    
}