package org.payroll.loan.entities;
import javax.persistence.*;
import javax.persistence.Temporal; 
import javax.persistence.TemporalType; 
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "PYST_LOAN_TYPE")


public class PystLoanType {

@Id
@Column( name = "ID")
private BigDecimal id;

@Column( name = "CODE")
private String code;

@Column( name = "ACCOUNT")
private BigDecimal account;

@Column( name = "COMP_ID")
private BigDecimal compId;

@Column( name = "LOAN_TYPE_DESC_M")
private String loanTypeDescM;

@Column( name = "LOAN_TYPE_DESC_O")
private String loanTypeDescO;

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


public String getCode() {
return this.code;
}


public void setCode(String code) {
this.code = code;
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


public String getLoanTypeDescM() {
return this.loanTypeDescM;
}


public void setLoanTypeDescM(String loanTypeDescM) {
this.loanTypeDescM = loanTypeDescM;
}


public String getLoanTypeDescO() {
return this.loanTypeDescO;
}


public void setLoanTypeDescO(String loanTypeDescO) {
this.loanTypeDescO = loanTypeDescO;
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