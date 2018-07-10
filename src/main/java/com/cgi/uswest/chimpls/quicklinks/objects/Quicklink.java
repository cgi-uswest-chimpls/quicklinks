package com.cgi.uswest.chimpls.quicklinks.objects;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Quicklink {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	private String txtext;
	private String txlink;
	private String county;
	
	Quicklink() {};
	
	public Quicklink(String txtext, String txlink, String county) {
		super();
		this.txtext = txtext;
		this.txlink = txlink;
		this.county = county;
	}

	public String getTxtext() {
		return txtext;
	}

	public void setTxtext(String txtext) {
		this.txtext = txtext;
	}

	public String getTxlink() {
		return txlink;
	}

	public void setTxlink(String txlink) {
		this.txlink = txlink;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
}
