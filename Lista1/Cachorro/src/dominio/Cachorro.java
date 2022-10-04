package dominio;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public Cachorro clonarCachorro(){
        Cachorro cachorroClonado = new Cachorro(this.getNome(), this.getRaca(), this.getIdade());
        return cachorroClonado;
    }
}
