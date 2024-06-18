import java.util.Scanner;
public class Iphone {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            ReprodutorMusi rep = new ReprodutorMusi();
            AparelhoTelefonico apt = new AparelhoTelefonico();
            NavegadorInternet nav = new NavegadorInternet();
            boolean loop = true;
            while (loop) {
                System.out.println("Descubra e se surpreenda com as novas funcionalidades do Iphone!");
                System.out.println("1: Abrir o navegador.");
                System.out.println("2: Realizar uma ligação.");
                System.out.println("3: Escolher a sua música preferida.");
                System.out.println("0: Desligar o dispositivo.");
                int funcao = scanner.nextInt();
                switch (funcao) {
                    case 1:
                        nav.adicionarNovaAba();
                        loop = false;
                        break;
                    case 2:
                        apt.ligar("0001-0001");
                        loop = false;
                        break;
                    case 3:
                        rep.selecionarMusica();
                        loop = false;
                        break;
                    case 0:
                        loop = false;
                        System.out.println("Desligando...");
                        break;
                    default:
                        System.out.println("Algo deu errado, tente novamente.");
                }   
            }
        scanner.close();
        }
    }
}
