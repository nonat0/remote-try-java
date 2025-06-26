import java.util.*;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Date data = new Date(); 
        Emprestimo emprestimo = new Emprestimo(data, data, livro, usuario);

        usuario.adicionarEmprestimo(emprestimo);
        livro.validarDisponibilidade();

        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
