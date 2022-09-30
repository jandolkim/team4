package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentCompleted extends AbstractEvent {

    private Long id;
    private Long flowerId;
    private Date payDate;
    private String cardNo;
    private Long orderId;
    private Integer qty;
    private Double price;
}

