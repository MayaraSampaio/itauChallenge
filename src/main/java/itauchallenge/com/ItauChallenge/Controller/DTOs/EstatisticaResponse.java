package itauchallenge.com.ItauChallenge.DTOs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
public class EstatisticaResponse {
    private Integer count;
    private Double sum;
    private Double avg;
    private Double min;
    private Double max;

    public EstatisticaResponse(Integer count, Double sum, Double avg, Double min, Double max) {
        this.count = count;
        this.sum = sum;
        this.avg = avg;
        this.min = min;
        this.max = max;
    }
    public EstatisticaResponse() {
        this.count = 0;
        this.sum = 0.0;
        this.avg = 0.0;
        this.min = 0.0;
        this.max = 0.0;
    }

}
