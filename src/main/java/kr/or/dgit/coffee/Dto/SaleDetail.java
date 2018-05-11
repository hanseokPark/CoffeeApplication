package kr.or.dgit.coffee.Dto;

public class SaleDetail {
	private int rank;
	private int supplyPirce;
	private int addTax;
	private int salePrice;
	private int marginPrice;
	private Sale sale;
	
	private SaleDetail() {}

	
	private SaleDetail(int rank, int supplyPirce, int addTax, int salePrice, int marginPrice, Sale sale) {
		this.rank = rank;
		this.supplyPirce = supplyPirce;
		this.addTax = addTax;
		this.salePrice = salePrice;
		this.marginPrice = marginPrice;
		this.sale = sale;
	}


	public Sale getSale() {
		return sale;
	}


	public void setSale(Sale sale) {
		this.sale = sale;
	}


	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSupplyPirce() {
		return supplyPirce;
	}

	public void setSupplyPirce(int supplyPirce) {
		this.supplyPirce = supplyPirce;
	}

	public int getAddTax() {
		return addTax;
	}

	public void setAddTax(int addTax) {
		this.addTax = addTax;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getMarginPrice() {
		return marginPrice;
	}

	public void setMarginPrice(int marginPrice) {
		this.marginPrice = marginPrice;
	}

	@Override
	public String toString() {
		return String.format("SaleDetail [rank=%s, supplyPirce=%s, addTax=%s, salePrice=%s, marginPrice=%s]", rank,
				supplyPirce, addTax, salePrice, marginPrice);
	}
	
	
}
