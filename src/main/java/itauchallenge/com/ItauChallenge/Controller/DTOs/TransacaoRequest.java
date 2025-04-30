package itauchallenge.com.ItauChallenge.Controller.DTOs;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record TransacaoRequest (@NotNull(message ="The value cannot be null")
                                @DecimalMin(value = "0.0", message = "The value must be greater than or equal to zero")
                                BigDecimal valor,

                                @NotNull(message = "The date cannot be null")
                                @PastOrPresent(message = "The date must be in the past or present")
                                OffsetDateTime dataHora){}
