import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestaoAlunos {
    private List<Aluno> alunos;
    private Scanner scanner;

    public GestaoAlunos() {
        alunos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        alunos.add(new Aluno(nome, idade));
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void excluirAluno() {
        System.out.print("Digite o nome do aluno a ser excluído: ");
        String nome = scanner.nextLine();
        boolean removido = alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void buscarAluno() {
        System.out.print("Digite o nome do aluno a ser buscado: ");
        String nome = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println(aluno);
                return; // Sai do método após encontrar o aluno
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("Lista de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();

        gestao.adicionarAluno();
        gestao.adicionarAluno();
        gestao.adicionarAluno();

        System.out.println("\nListando alunos:");
        gestao.listarAlunos();

        System.out.println("\nBuscando aluno:");
        gestao.buscarAluno();

        System.out.println("\nExcluindo aluno:");
        gestao.excluirAluno();

        System.out.println("\nTentando excluir aluno inexistente:");
        gestao.excluirAluno();

        System.out.println("\nBuscando aluno após exclusão:");
        gestao.buscarAluno();

        gestao.scanner.close(); // Fecha o scanner
    }
}