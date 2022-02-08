package org.payroll.loan.entities;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "PYST_CURRENCY_TYPE")


public class PystCurrencyType {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column( name = "ID")
private BigDecimal id;

@Column( name = "ACCOUNT")
private BigDecimal account;

@Column( name = "COMP_ID")
private BigDecimal compId;

@Column( name = "CURRENCY_TYPE_DESC_M")
private String currencyTypeDescM;

@Column( name = "CURRENCY_TYPE_DESC_O")
private String currencyTypeDescO;

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

@Column( name = "CODE")
private String code;

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


public String getCurrencyTypeDescM() {
return this.currencyTypeDescM;
}


public void setCurrencyTypeDescM(String currencyTypeDescM) {
this.currencyTypeDescM = currencyTypeDescM;
}


public String getCurrencyTypeDescO() {
return this.currencyTypeDescO;
}


public void setCurrencyTypeDescO(String currencyTypeDescO) {
this.currencyTypeDescO = currencyTypeDescO;
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


public String getCode() {
return this.code;
}


public void setCode(String code) {
this.code = code;
}



}