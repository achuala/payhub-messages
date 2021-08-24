package in.achuala.payment.payhub.messages;

import lombok.Data;

@Data
public class Money {
    protected String currency;
    protected String amount;
}
