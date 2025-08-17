public class Banda {

    private String nome;
    private String genero;
    private Empresario emp;
    private Musica[] musicas = new Musica[99];
    private Membro[] membros = new Membro[99];

    void mostraInfo(){
        System.out.println("Nome da banda: " + this.nome);
        System.out.println("Genero da banda: " + this.genero);
        System.out.println("Nome do empresario: " + emp.getNome());
        System.out.println("CNPJ do empresario: " + emp.getCnpj());
        for(int i = 0; i < membros.length; i++) {
            if(membros[i] != null){
                System.out.println("Membro: " + membros[i].getNome());
                System.out.println("Funcao: " + membros[i].getFuncao());
            }
        }
        for(int i = 0; i < musicas.length; i++) {
            if(musicas[i] != null){
                System.out.println("Musica: " + musicas[i].getNome());
                System.out.println("Duracao da musica: " + musicas[i].getDuracao());
            }
        }
    }

    void addMusicaNova(Musica musica){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    void addMembroNovo(Membro membro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }

    void Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    void setEmp(Empresario emp){
        this.emp = emp;
    }

}
