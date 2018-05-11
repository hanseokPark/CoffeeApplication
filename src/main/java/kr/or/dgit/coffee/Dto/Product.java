package kr.or.dgit.Dto;

public class Product {
	private char code;
	private String name;
	
	
	private Product() {
		// TODO Auto-generated constructor stub
	}
	public char getCode() {
		return code;
	}
	public void setCode(char code) {
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
