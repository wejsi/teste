package org.claro.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.claro.utils.Util;

@Entity
@Table(name = "CEL_CELULAR", schema = "PUBLIC")
public class Celular {
	private String code;
	private String model;
	private Integer price;
	private String brand;
	private String photo;
	private String date;

	public Celular() {
		this.setCode(Util.gerarCode());
	}

	@Id
	@Column(name = "CEL_ID")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "CEL_MODEL")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "CEL_PRICE")
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Column(name = "CEL_BRAND")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "CEL_PHOTO")
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "CEL_DATE")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
