public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[99];

    void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo() {

        System.out.println("A lanchonete " + this.nome + " possui os seguintes salgados: ");

        for(int i = 0; i < salgados.length; i++) {
            if (salgados[i] != null) {
                System.out.println((i+1) + " - " + salgados[i].nome);
            }
        }
    }
}
