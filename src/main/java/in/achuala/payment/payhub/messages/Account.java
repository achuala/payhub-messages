package in.achuala.payment.payhub.messages;

import lombok.Data;

@Data
public class Account {
    protected String acctId;
    protected String acctTypeCode;
    protected String acctSchemeId;
    protected String acctSchemeIssuer;
    protected String iban;
    protected String currency;
    protected String acctAliasId;
    protected String acctOtherId;

}
