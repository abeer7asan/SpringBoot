package org.payroll.loan.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRS_PERSON_PROFILE")
public class PrsPersonProfile {
	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column( name = "ID")
private BigDecimal id;

@Column( name = "ACCOUNT")
private BigDecimal account;

@Column( name = "COMP_ID")
private BigDecimal compId;


@Column( name = "WORKFLOW_ID")
private BigDecimal workflowId;

@Column( name = "FIRST_NAME")
private String firstName;

@Column( name = "SECOND_NAME")
private String secondName;

@Column( name = "THIRD_NAME")
private String thirdName;

@Column( name = "FAMILY_NAME")
private String familyName;

@Column( name = "IMAGE_ID")
private BigDecimal imageId;

@Column( name = "REMARKS")
private String remarks;


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


}
