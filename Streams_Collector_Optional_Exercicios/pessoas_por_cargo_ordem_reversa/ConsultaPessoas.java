import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        return pessoas.stream().collect(Collectors.groupingBy(
                Pessoa::getCargo,
                TreeMap::new, // Usamos um TreeMap para manter a ordem reversa
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Pessoa::getNome))) // Ordena as pessoas por nome dentro do TreeSet
        ));
    }
}
