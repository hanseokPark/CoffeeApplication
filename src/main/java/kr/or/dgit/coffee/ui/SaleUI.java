package kr.or.dgit.coffee.ui;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import kr.or.dgit.coffee.service.SaleService;

@SuppressWarnings("serial")
public class SaleUI extends JFrame {

	public SaleUI() {
		initComponents(); 
	}

	private void initComponents() {
		
		setBounds(100, 100, 800, 400);
     
		AbstractTablePanel salePriceRankTable = new SaleDetailTablePanel();
		
		getContentPane().add(salePriceRankTable);
		
		Map<String, Boolean> map = new HashMap<>();
		map.put("isSalePrice", true);
		salePriceRankTable.loadData(SaleService.getInstance().callSaleDetail(map));
		
		JLabel lblNewLabel = new JLabel("판매금액 순위");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

	
}
