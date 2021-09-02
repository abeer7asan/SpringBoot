package org.payroll.loan.entities;
import javax.persistence.*;
import javax.persistence.Temporal; 
import javax.persistence.TemporalType; 
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "PYTR_LOAN_TRANSACTION")


public class PytrLoanTransaction {

@Id
@Column( name = "ID")
private BigDecimal id;

@Column( name = "ACCOUNT")
private BigDecimal account;

@Column( name = "COMP_ID")
private BigDecimal compId;

@Column( name = "PROFILE_ID")
private BigDecimal profileId;

@Column( name = "LOAN_TYPE_ID")
private BigDecimal loanTypeId;

@Column( name = "REQUEST_DATE")
@Temporal(TemporalType.DATE)
private Date requestDate;

@Column( name = "DUE_DATE")
@Temporal(TemporalType.DATE)
private Date dueDate;

@Column( name = "WORKFLOW_ID")
private BigDecimal workflowId;

@Column( name = "LOAN_AMOUNT")
private BigDecimal loanAmount;

@Column( name = "CURRENCY_ID")
private BigDecimal currencyId;

@Column( name = "PERIODS_NO")
private BigDecimal periodsNo;

@Column( name = "PERIOD_AMOUNT")
private BigDecimal periodAmount;

@Column( name = "SCHEDUAL_TYPE")
private String schedualType;

@Column( name = "SCHEDUAL_START_DATE")
@Temporal(TemporalType.DATE)
private Date schedualStartDate;

@Column( name = "SCHEDULE_END_DATE")
@Temporal(TemporalType.DATE)
private Date scheduleEndDate;

@Column( name = "PAYMENT_METHOD_ID")
private BigDecimal paymentMethodId;

@Column( name = "REMARKS")
private String remarks;

@Column( name = "LOAN_STATUS")
private String loanStatus;

@Column( name = "IS_VALID")
private String isValid;

@Column( name = "CREATED_BY")
private BigDecimal createdBy;

@Column( name = "CREATED_DATE")
@Temporal(TemporalType.DATE)
private Date createdDate;

@Column( name = "UPDATED_BY")
private BigDecimal updatedBy;

@Column( name = "UPDATED_DATE")
@Temporal(TemporalType.DATE)
private Date updatedDate;

@Column( name = "DELETED_BY")
private BigDecimal deletedBy;

@Column( name = "DELETED_DATE")
private BigDecimal deletedDate;

@Column( name = "IS_DELETED")
private String isDeleted;

public BigDecimal getId() {
return this.id;
}


public void setId(BigDecimal id) {
this.id = id;
}


public BigDecimal getAccount() {
return this.account;
}


public void setAccount(BigDecimal account) {
this.account = account;
}


public BigDecimal getCompId() {
return this.compId;
}


public void setCompId(BigDecimal compId) {
this.compId = compId;
}


public BigDecimal getProfileId() {
return this.profileId;
}


public void setProfileId(BigDecimal profileId) {
this.profileId = profileId;
}


public BigDecimal getLoanTypeId() {
return this.loanTypeId;
}


public void setLoanTypeId(BigDecimal loanTypeId) {
this.loanTypeId = loanTypeId;
}


public Date getRequestDate() {
return this.requestDate;
}


public void setRequestDate(Date requestDate) {
this.requestDate = requestDate;
}


public Date getDueDate() {
return this.dueDate;
}


public void setDueDate(Date dueDate) {
this.dueDate = dueDate;
}


public BigDecimal getWorkflowId() {
return this.workflowId;
}


public void setWorkflowId(BigDecimal workflowId) {
this.workflowId = workflowId;
}


public BigDecimal getLoanAmount() {
return this.loanAmount;
}


public void setLoanAmount(BigDecimal loanAmount) {
this.loanAmount = loanAmount;
}


public BigDecimal getCurrencyId() {
return this.currencyId;
}


public void setCurrencyId(BigDecimal currencyId) {
this.currencyId = currencyId;
}


public BigDecimal getPeriodsNo() {
return this.periodsNo;
}


public void setPeriodsNo(BigDecimal periodsNo) {
this.periodsNo = periodsNo;
}


public BigDecimal getPeriodAmount() {
return this.periodAmount;
}


public void setPeriodAmount(BigDecimal periodAmount) {
this.periodAmount = periodAmount;
}


public String getSchedualType() {
return this.schedualType;
}


public void setSchedualType(String schedualType) {
this.schedualType = schedualType;
}


public Date getSchedualStartDate() {
return this.schedualStartDate;
}


public void setSchedualStartDate(Date schedualStartDate) {
this.schedualStartDate = schedualStartDate;
}


public Date getScheduleEndDate() {
return this.scheduleEndDate;
}


public void setScheduleEndDate(Date scheduleEndDate) {
this.scheduleEndDate = scheduleEndDate;
}


public BigDecimal getPaymentMethodId() {
return this.paymentMethodId;
}


public void setPaymentMethodId(BigDecimal paymentMethodId) {
this.paymentMethodId = paymentMethodId;
}


public String getRemarks() {
return this.remarks;
}


public void setRemarks(String remarks) {
this.remarks = remarks;
}


public String getLoanStatus() {
return this.loanStatus;
}


public void setLoanStatus(String loanStatus) {
this.loanStatus = loanStatus;
}


public String getIsValid() {
return this.isValid;
}


public void setIsValid(String isValid) {
this.isValid = isValid;
}


public BigDecimal getCreatedBy() {
return this.createdBy;
}


public void setCreatedBy(BigDecimal createdBy) {
this.createdBy = createdBy;
}


public Date getCreatedDate() {
return this.createdDate;
}


public void setCreatedDate(Date createdDate) {
this.createdDate = createdDate;
}


public BigDecimal getUpdatedBy() {
return this.updatedBy;
}


public void setUpdatedBy(BigDecimal updatedBy) {
this.updatedBy = updatedBy;
}


public Date getUpdatedDate() {
return this.updatedDate;
}


public void setUpdatedDate(Date updatedDate) {
this.updatedDate = updatedDate;
}


public BigDecimal getDeletedBy() {
return this.deletedBy;
}


public void setDeletedBy(BigDecimal deletedBy) {
this.deletedBy = deletedBy;
}


public BigDecimal getDeletedDate() {
return this.deletedDate;
}


public void setDeletedDate(BigDecimal deletedDate) {
this.deletedDate = deletedDate;
}


public String getIsDeleted() {
return this.isDeleted;
}


public void setIsDeleted(String isDeleted) {
this.isDeleted = isDeleted;
}



}