package in.achuala.payment.payhub.messages;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class BusinessApplicationHeader {
    private String from;
    private String to;
    private String bizMsgId;
    private String msgDefId;
    private String bizSvc;
    private ZonedDateTime createdTs;
    private ZonedDateTime bizProcTs;
    private String priority;
    private String signature;
}
