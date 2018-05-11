package kr.or.dgit.coffee.Dto;

public class Sale {
	private int no;
	private String code;
	private int price;
	private int saleCnt; //판매수량
	private int marginRate; //마진율
	private Product product; //제품
	

	public Sale() {}



	public Sale(int no, Product product, int price, int saleCnt, int marginRate) {
		this.no = no;
		this.product = product;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSaleCnt() {
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}
	public int getMarginRate() {
		return marginRate;
	}
	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	
	
}
