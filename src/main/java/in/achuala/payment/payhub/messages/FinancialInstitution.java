package in.achuala.payment.payhub.messages;

import lombok.Data;

@Data
public class FinancialInstitution {
    protected String id;
    protected String idType;
    protected String name;
    protected PostalAddress postalAddress;
}
