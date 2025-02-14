import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ProcessamentoDePagamentos {

    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int valorPagamento = random.nextInt(1000); // Valor aleatório entre 0 e 999
            String idTransacao = gerarIdTransacao();

            logger.info("Iniciando processamento de pagamento. ID da transação: {}, Valor: {}", idTransacao, valorPagamento);

            try {
                processarPagamento(valorPagamento);
                logger.info("Pagamento processado com sucesso. ID da transação: {}", idTransacao);
            } catch (PagamentoRecusadoException e) {
                logger.error("Pagamento recusado. ID da transação: {}, Valor: {}, Motivo: {}", idTransacao, valorPagamento, e.getMessage());
            } catch (Exception e) {
                logger.error("Erro ao processar pagamento. ID da transação: {}, Valor: {}, Erro: {}", idTransacao, valorPagamento, e.getMessage());
            }
        }
    }

    private static void processarPagamento(int valorPagamento) throws PagamentoRecusadoException {
        if (valorPagamento > 500) {
            throw new PagamentoRecusadoException("Valor do pagamento excedido.");
        }

        // Simulação de processamento de pagamento
        try {
            Thread.sleep(1000); // Simula um atraso no processamento
        } catch (InterruptedException e) {
            logger.warn("Thread interrompida durante o processamento do pagamento.");
        }
    }

    private static String gerarIdTransacao() {
        // Simulação de geração de ID de transação (pode ser um UUID ou outro método)
        return String.valueOf(System.currentTimeMillis());
    }

    static class PagamentoRecusadoException extends Exception {
        public PagamentoRecusadoException(String message) {
            super(message);
        }
    }
}