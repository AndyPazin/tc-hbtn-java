import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Conteúdo do arquivo '" + fileName + "':\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("\nLeitura do arquivo concluída.");
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace(); // Imprime o rastreamento da pilha para diagnóstico
        }

    }
}