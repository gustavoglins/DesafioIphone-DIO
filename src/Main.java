import java.util.Scanner;

public class Main {

    private static final Iphone iphone = new Iphone();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        home();
    }

    private static void home() {
        System.out.println("\n--------------------------------");
        System.out.println("---------- [ IPHONE ] ----------");
        System.out.println("--------------------------------");

        System.out.println("[ 1 ] - Abrir Navegador Internet");
        System.out.println("[ 2 ] - Abrir Reprodutor Musical");
        System.out.println("[ 3 ] - Abrir Telefone");
        System.out.println("[ 0 ] - Desligar");
        System.out.print("Selecione uma opção: ");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                abrirNavegadorInternet();
                break;
            case 2:
                abrirReprodutorMusical();
                break;
            case 3:
                abrirTelefone();
                break;
            case 0:
                System.out.println("\nDesligando...");
                System.exit(1);
                break;
            default:
                home();
                break;
        }
    }

    private static void abrirNavegadorInternet() {
        System.out.println("\n ----[ Navegador Internet ] ----");
        System.out.println("[ 1 ] -  Exibir página");
        System.out.println("[ 2 ] -  Criar nova guia");
        System.out.println("[ 3 ] -  Atualizar página");
        System.out.println("[ 0 ] -  Voltar para Home");
        System.out.print("Selecione uma opção: ");
        int action2 = scanner.nextInt();
        switch (action2) {
            case 1:
                System.out.print("\nDigite a URL: ");
                String url = scanner.next();
                System.out.println("\n"+iphone.navegadorInternet.exibirPagina(url));
                abrirNavegadorInternet();
                break;
            case 2:
                System.out.println("\n"+iphone.navegadorInternet.criarNovaAba());
                abrirNavegadorInternet();
                break;
            case 3:
                System.out.println("\n"+iphone.navegadorInternet.atualizarPagina());
                abrirNavegadorInternet();
                break;
            case 0:
                home();
                break;
            default:
                System.out.println("\nPor favor, digite uma opção válida!");
                abrirNavegadorInternet();
                break;
        }
    }

    private static void abrirReprodutorMusical() {
        System.out.println("\n---- [ Reprodutor Musical ] ----");
        System.out.println("[ 1 ] -  Tocar Música");
        System.out.println("[ 2 ] -  Pausar Música");
        System.out.println("[ 3 ] -  Próxima Música");
        System.out.println("[ 0 ] -  Voltar para Home");
        System.out.print("Selecione uma opção: ");
        int action2 = scanner.nextInt();
        switch (action2) {
            case 1:
                System.out.print("\nDigite o nome da música: ");
                scanner.nextLine();
                String musica = scanner.nextLine();
                System.out.println("\n"+iphone.reprodutorMusical.tocarMusica(musica));
                abrirReprodutorMusical();
                break;
            case 2:
                System.out.println("\n"+iphone.reprodutorMusical.pausarMusica());
                abrirReprodutorMusical();
                break;
            case 3:
                System.out.println("\n"+iphone.reprodutorMusical.proximaMusica());
                abrirReprodutorMusical();
                break;
            case 0:
                home();
                break;
            default:
                System.out.println("\nPor favor, digite uma opção válida!");
                abrirReprodutorMusical();
                break;
        }
    }

    private static void abrirTelefone(){
        System.out.println("\n--------- [ Telefone ] ---------");
        System.out.println("[ 1 ] - Ligar");
        System.out.println("[ 2 ] - Atender");
        System.out.println("[ 3 ] - Desligar");
        System.out.println("[ 0 ] - Voltar para Home");
        System.out.print("Selecione uma opção: ");
        int action2 = scanner.nextInt();
        switch (action2){
            case 1:
                System.out.print("\nNúmero: ");
                long numero = scanner.nextLong();
                System.out.println("\n"+iphone.aparelhoEletronico.ligar(numero));
                abrirTelefone();
                break;
            case 2:
                System.out.println("\n"+iphone.aparelhoEletronico.atender());
                abrirTelefone();
                break;
            case 3:
                System.out.println("\n"+iphone.aparelhoEletronico.desligar());
                abrirTelefone();
                break;
            case 0:
                home();
                break;
            default:
                System.out.println("\nPor favor, digite uma opção válida!");
                abrirTelefone();
                break;
        }
    }
}
