import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Digite as linhas de texto (digite 'sair' para encerrar):");

            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("sair")) {
                    break; // Sai do loop quando o usuário digita "sair"
                }
                writer.write(line);
                writer.newLine(); // Adiciona uma nova linha após cada entrada
            }

            System.out.println("Arquivo criado e conteúdo salvo com sucesso!");

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace(); // Imprime o rastreamento da pilha para diagnóstico
        } finally {
            scanner.close(); // Fecha o Scanner no bloco finally para garantir que seja sempre fechado.
        }
    }
}