import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv"; // Nome do arquivo CSV

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
        //    boolean firstLine = true; // Flag para ignorar o cabeçalho, se existir

            while ((line = reader.readLine()) != null) {
//                if (firstLine) {
//                    firstLine = false; // Ignora a primeira linha (cabeçalho)
//                    continue; // Vai para a próxima iteração do loop
//                }

                String[] data = line.split(","); // Divide a linha em partes usando a vírgula como delimitador

                if (data.length == 4) { // Verifica se há 4 colunas (Nome, Idade, Departamento, Salário)
                    String nome = data[0].trim(); // Remove espaços em branco extras
                    String idade = data[1].trim();
                    String departamento = data[2].trim();
                    String salario = data[3].trim();

                    try {
//                        int idade = Integer.parseInt(idadeStr);
//                        int salario = Integer.parseInt(salarioStr);

                        System.out.println("Funcionário: " + nome);
                        System.out.println("Idade: " + idade);
                        System.out.println("Departamento: " + departamento);
                        System.out.println("Salarial: " + salario);
                        System.out.println("------------------------");

                    } catch (NumberFormatException e) {
                        System.err.println("Erro ao converter idade ou salário para número na linha: " + line);
                        e.printStackTrace();
                    }
                } else {
                    System.err.println("Linha com formato incorreto (número de colunas inválido): " + line);
                }
            }

            System.out.println("Leitura do arquivo concluída.");

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
