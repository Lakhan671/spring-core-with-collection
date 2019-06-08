
public class Customer {
private int AccountId;
private String CustName;
public int getAccountId() {
	return AccountId;
}
public void setAccountId(int accountId) {
	AccountId = accountId;
}
public String getCustName() {
	return CustName;
}
public void setCustName(String custName) {
	CustName = custName;
}
@Override
public String toString() {
	return "Customer [AccountId=" + AccountId + ", CustName=" + CustName + "]";
}

}
