package com.model;

public class product {

	
	 private int p_id,p_avaibility_dz;
	 private String p_name, p_category, p_quality ,description;
	private float p_price_pr_dz;
	public product() {
		super();
	}
	public product(int p_id, int p_avaibility_dz, String p_name, String p_category, String p_quality,
			String description, float p_price_pr_dz) {
		super();
		this.p_id = p_id;
		this.p_avaibility_dz = p_avaibility_dz;
		this.p_name = p_name;
		this.p_category = p_category;
		this.p_quality = p_quality;
		this.description = description;
		this.p_price_pr_dz = p_price_pr_dz;
	}
	@Override
	public String toString() {
		return "product [p_id=" + p_id + ", p_avaibility_dz=" + p_avaibility_dz + ", p_name=" + p_name + ", p_category="
				+ p_category + ", p_quality=" + p_quality + ", description=" + description + ", p_price_pr_dz="
				+ p_price_pr_dz + "]";
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getP_avaibility_dz() {
		return p_avaibility_dz;
	}
	public void setP_avaibility_dz(int p_avaibility_dz) {
		this.p_avaibility_dz = p_avaibility_dz;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_category() {
		return p_category;
	}
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	public String getP_quality() {
		return p_quality;
	}
	public void setP_quality(String p_quality) {
		this.p_quality = p_quality;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getP_price_pr_dz() {
		return p_price_pr_dz;
	}
	public void setP_price_pr_dz(float p_price_pr_dz) {
		this.p_price_pr_dz = p_price_pr_dz;
	}

}
