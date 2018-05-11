package kr.or.dgit.coffee.Dto;

public class Product {
	private String code;
	private String name;
	
	
	private Product() {}
	
	private Product(String code, String name) {
		this.code = code;
		this.name = name;
	}

	private Product(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return String.format("Product [code=%s, name=%s]", code, name);
	}
	
	
	

}	
