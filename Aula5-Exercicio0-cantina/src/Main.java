import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cantina c = new Cantina();
        c.nome = "Cantina do Inatel";
        Salgado[] s = new Salgado[99];

        int x;
        int contador = 0;

        do{

            System.out.println("1 - Adicionar salgado");
            System.out.println("0 - Finalizar adição");

            x = sc.nextInt();
            sc.nextLine();

            if (x == 1) {
                s[contador] = new Salgado();
                System.out.println("Entre com o nome do salgado: ");
                s[contador].nome = sc.nextLine();
                c.addSalgado(s[contador]);
                contador++;
            } else if (x == 0) {
                System.out.println("Finalizando...");
            }
            else {
                System.out.println("Opção inválida!");
            }

        }while(x != 0);

        c.mostraInfo();


        sc.close();
    }
}