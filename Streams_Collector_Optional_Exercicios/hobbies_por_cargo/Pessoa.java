import java.util.*;

public class Pessoa implements Comparable {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.hobbies = hobbies;
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void adicionarHobby(String hobby) {
        this.hobbies.add(hobby);
    }

    @Override
    public String toString() {
        Locale.setDefault(new Locale("pt", "BR"));
        return String.format("[%d] %s %s %d R$ %f", getCodigo(),
                getNome(), getCargo(), getIdade(), getSalario());
    }

    @Override
    public int compareTo(Object obj) {
        Pessoa pessoa = (Pessoa) obj;
        return this.getNome().compareTo(pessoa.getNome());
    }
}