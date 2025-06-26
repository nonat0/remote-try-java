import java.util.*;

public class Pessoa {
    protected String nome;
    protected List<Livro> livros = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
