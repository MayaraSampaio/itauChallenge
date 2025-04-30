package itauchallenge.com.ItauChallenge.Service;

import itauchallenge.com.ItauChallenge.Controller.DTOs.TransacaoRequest;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private final List<TransacaoRequest> transacoes = new ArrayList<>();

    public void adicionarTransacao(TransacaoRequest transacao) {
       transacoes.add(transacao);
    }

    public void limparTransacoes() {
        transacoes.clear();
    }

   public List<TransacaoRequest> list(Integer intervaloTempo) {
       OffsetDateTime intervalo = OffsetDateTime.now().minusSeconds(intervaloTempo);
       return transacoes.stream().filter(transacoes -> transacoes.dataHora().isAfter(intervalo)).toList();

   }
}
