package itauchallenge.com.ItauChallenge.DTOs;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class TransacaoRequest {
    @NotBlank(message = "O valor não pode ser nulo ou vazio")
    @DecimalMin(value = "0.0", message = "O valor deve ser igual ou maior que zero")
    private BigDecimal valor;

    @NotBlank(message = "A data não pode ser nula ou vazia")
    @PastOrPresent(message = "A data deve ser no passado ou presente")
    private OffsetDateTime dataHora;

    public TransacaoRequest(BigDecimal valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

}
