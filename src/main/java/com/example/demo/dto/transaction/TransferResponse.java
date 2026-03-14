package com.example.demo.dto.transaction;

import com.example.demo.enums.TransactionStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TransferResponse {
    private Long transactionId;
    private String receiverUsername;
    private BigDecimal amount;
    private BigDecimal remainingBalance;
    private TransactionStatus status;
    private LocalDateTime timestamp;

}
