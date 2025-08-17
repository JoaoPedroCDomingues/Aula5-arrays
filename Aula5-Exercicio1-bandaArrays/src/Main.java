import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Banda b = new Banda();
        Empresario emp = new Empresario();
        Musica[] mu = new Musica[99];
        Membro[] me = new Membro[99];

        String k;
        long cnpj;
        String l;
        int x;
        int c = 0;
        int d = 0;

        System.out.println("Qual o nome e CNPJ do empresário?");
        k = sc.nextLine();
        cnpj = sc.nextLong();
        sc.nextLine();
        emp.Empresario(k, cnpj);
        b.setEmp(emp);
        System.out.println("Qual o nome e genero da banda?");
        l = sc.nextLine();
        k = sc.nextLine();
        b.Banda(l, k);

        do {

            System.out.println("1 - Adicionar membro");
            System.out.println("2 - Adicionar musica");
            System.out.println("0 - Finalizar");
            x = sc.nextInt();
            sc.nextLine();
            if(x == 1){
                me[c] = new Membro();
                System.out.println("Qual o nome e função do novo membro?");
                me[c].setNome(sc.nextLine());
                me[c].setFuncao(sc.nextLine());
                b.addMembroNovo(me[c]);
                c++;
            }
            else if(x == 2){
                mu[d] = new Musica();
                System.out.println("Qual o nome e duração da musica?");
                mu[d].setNome(sc.nextLine());
                mu[d].setDuracao(sc.nextLong());
                b.addMusicaNova(mu[d]);
                d++;
            }else if(x == 0){
                System.out.println("Finalizando...");
            }
            else{
                System.out.println("Comando incorreto!");
            }

        }while (x != 0);

        b.mostraInfo();

        sc.close();
    }
}