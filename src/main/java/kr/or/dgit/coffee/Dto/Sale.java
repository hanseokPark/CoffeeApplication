package kr.or.dgit.coffee.Dto;

import kr.or.dgit.coffee.ui.ToArray;

public class Sale implements ToArray {
	private int no;
	private String code;
	private int price;
	private int saleCnt; //판매수량
	private int marginRate; //마진율
	private Product product; //제품
	
	private SaleDetail saleDetail;
	

	public Sale() {}


	

	public Sale(int no, Product product, int saleCnt, int marginRate, SaleDetail saleDetail) {
		this.no = no;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
		this.product = product;
		this.saleDetail = saleDetail;
	}




	public Sale(int no, Product product, int price, int saleCnt, int marginRate) {
		this.no = no;
		this.product = product;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}

	

	public SaleDetail getSaleDetail() {
		return saleDetail;
	}




	public void setSaleDetail(SaleDetail saleDetail) {
		this.saleDetail = saleDetail;
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




	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return new Object[] {saleDetail.getRank(), product.getCode(), product.getName(), String.format("%,d", price), saleCnt, 
				String.format("%,d", saleDetail.getSupplyPirce()), String.format("%,d", saleDetail.getAddTax()), String.format("%,d", saleDetail.getSalePrice()), String.format("%d%%", marginRate), String.format("%,d", saleDetail.getMarginPrice())};
	}

	
	
}
