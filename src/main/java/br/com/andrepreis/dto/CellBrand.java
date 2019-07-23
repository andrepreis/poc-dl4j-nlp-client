package br.com.andrepreis.dto;

import java.io.Serializable;

public class CellBrand implements Serializable{

	private static final long serialVersionUID = -5085477343007043839L;
	
	private String cellPhoneDesc;
	private String brandName;
	private Double brandScore;
	
	
	
	public Double getBrandScore() {
		return brandScore;
	}
	public void setBrandScore(Double brandScore) {
		this.brandScore = brandScore;
	}
	public String getCellPhoneDesc() {
		return cellPhoneDesc;
	}
	public void setCellPhoneDesc(String cellPhoneDesc) {
		this.cellPhoneDesc = cellPhoneDesc;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "CellBrand [cellPhoneDesc=" + cellPhoneDesc + ", brandName=" + brandName + ", brandScore=" + brandScore
				+ "]";
	}
	
	
	
	
		

}
