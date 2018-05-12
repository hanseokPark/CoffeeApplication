package kr.or.dgit.coffee.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.SwingConstants;

import kr.or.dgit.coffee.service.SaleService;

@SuppressWarnings("serial")
public class SaleDetailTablePanel extends AbstractTablePanel{

	@Override
	protected void setAlignWith() {
		// TODO Auto-generated method stub
		tableCellAlignment(SwingConstants.CENTER, 0, 1, 2, 8);
		tableCellAlignment(SwingConstants.RIGHT, 3, 4, 5, 6, 7, 8, 9);
		tableSetWidth(100,100,150,100,100,150,150,150,100,150);
	}

	@Override
	protected Object[][] toArray(List<? extends ToArray> items){
		Object[][] results = new Object[items.size()+1][];
		for(int i=0; i<items.size(); i++) {
			results[i] = items.get(i).toArray();
		}
		results[items.size()] = getTotal();
		return results;
	}
	
	private Object[] getTotal() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> res = SaleService.getInstance().getTotal();
		Map<String, Object> maps = res.get(0);
		
		String[] total = new String[10];
		total[0] = "합계";
		Arrays.fill(total, 1, 4, "");
		total[5] = String.format("%,.0f", maps.get("salePrice"));
		total[6] = String.format("%,.0f", maps.get("addTax"));
		total[7] = String.format("%,.0f", maps.get("supplyPirce"));
		total[8] = "";
		total[9] = String.format("%,.0f", maps.get("marginPrice"));		
		return total;
	}

	@Override
	public void setColumnNames() {
		// TODO Auto-generated method stub
		colNames = new String[] {"순위", "제품코드", "제품명", "제품단가",
	            "판매수량", "공급가액", "부가세액", "판매금액", "마진율", "마진액" };
	}
}
