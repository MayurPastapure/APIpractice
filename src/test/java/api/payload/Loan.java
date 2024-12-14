package api.payload;

public class Loan {
//	"allocationStatus": "ALLOCATED",
//	"includeCustomerDetails": true,
//	"includeLoanOutstandingDetails": true,
//	"includeMetaDataLoanAllocation": true,
//	"restrictedView": true,
//	"page": 0,
//	"size": 100
	
	String allocationStatus;
	Boolean includeCustomerDetails;
	Boolean includeLoanOutstandingDetails;
	Boolean includeMetaDataLoanAllocation;
	Boolean restrictedView;
	int page;
	int size;
	
	public String getAllocationStatus() {
		return allocationStatus;
	}
	public void setAllocationStatus(String allocationStatus) {
		this.allocationStatus = allocationStatus;
	}
	public Boolean getIncludeCustomerDetails() {
		return includeCustomerDetails;
	}
	public void setIncludeCustomerDetails(Boolean includeCustomerDetails) {
		this.includeCustomerDetails = includeCustomerDetails;
	}
	public Boolean getIncludeLoanOutstandingDetails() {
		return includeLoanOutstandingDetails;
	}
	public void setIncludeLoanOutstandingDetails(Boolean includeLoanOutstandingDetails) {
		this.includeLoanOutstandingDetails = includeLoanOutstandingDetails;
	}
	public Boolean getIncludeMetaDataLoanAllocation() {
		return includeMetaDataLoanAllocation;
	}
	public void setIncludeMetaDataLoanAllocation(Boolean includeMetaDataLoanAllocation) {
		this.includeMetaDataLoanAllocation = includeMetaDataLoanAllocation;
	}
	public Boolean getRestrictedView() {
		return restrictedView;
	}
	public void setRestrictedView(Boolean restrictedView) {
		this.restrictedView = restrictedView;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
