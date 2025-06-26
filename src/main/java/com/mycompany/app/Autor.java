import java.util.*;

public class Autor {
    private String nome;
    private String nacionalidade;
    private List<Livro> obrasPublicadas = new ArrayList<>();

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }
}
