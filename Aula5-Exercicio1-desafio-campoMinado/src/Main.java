import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[][] bomba = new int[2][2];
        int fim = 0;

        int minaX = rand.nextInt(2);
        int minaY = rand.nextInt(2);

        System.out.println("Posição: " + minaX + " - " + minaY);

        bomba[minaX][minaY] = 1;

        do{
            System.out.println("Qual posição X você deseja pisar?");
            int x = sc.nextInt();
            System.out.println("Qual posição Y você deseja pisar?");
            int y = sc.nextInt();

            if (bomba[x][y] == 1) {
                System.out.println("Você foi de vasco da gama");
            }
            else {
                System.out.println("Você sobreviveu!");
                fim = 1;
            }
        }while(fim != 1);

        sc.close();
    }
}