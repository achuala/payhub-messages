package in.achuala.payment.payhub.messages;


import lombok.Data;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class FIToFICustomerCreditTransfer {
    protected String msgId;
    protected ZonedDateTime createdTs;
    protected String nbOfTxns;
    protected BigDecimal ctrlSum;
    protected FinancialInstitution instgAgt;
    protected FinancialInstitution instdAgt;

    protected List<CreditTransferTransaction> cdtTrfTxInf;

    Map<String, Object> supplementaryData;

    @Data
    public static class CreditTransferTransaction {
        protected String paymentId;
        protected  String endToEndId;
        protected  String transactionId;
        protected  String uetr;
        protected  String clearingSysRefId;

        protected  String pymtSvcType;
        protected  String priority;
        protected  String pymtInstrChoice;
        protected Money intrBkSttlmAmt;
        protected Date intrBkSttlmDt;
        protected String chargeBearer;

        protected Money instructedAmount;
        protected String purposeCode;
        protected String remittanceInfo;

        protected String debtorName;
        protected PostalAddress debtorAddress;
        protected Account debtorAccount;

        protected String creditorName;
        protected PostalAddress creditorAddress;
        protected Account creditorAccount;

        Map<String, Object> supplementaryData;
    }
}
