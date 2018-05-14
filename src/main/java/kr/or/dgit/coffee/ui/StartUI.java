package kr.or.dgit.coffee.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.apache.ibatis.exceptions.PersistenceException;

import kr.or.dgit.coffee.Dto.Product;
import kr.or.dgit.coffee.Dto.Sale;
import kr.or.dgit.coffee.service.ProductService;
import kr.or.dgit.coffee.service.SaleService;

@SuppressWarnings("serial")
public class StartUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfNo;
	private JTextField tfPrice;
	private JTextField tfSale;
	private JTextField tfMargins;
	private JTextField tfName;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;

	public StartUI() {
		initComponents();
	}

	private void initComponents() {
		setTitle("입력화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 5));
		
		JPanel textpanel = new JPanel();
		contentPane.add(textpanel, BorderLayout.CENTER);
		textpanel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JPanel textpanel1 = new JPanel();
		textpanel.add(textpanel1);
		textpanel1.setLayout(new GridLayout(0, 2, 10, 15));
		
		JLabel lblNo = new JLabel("제품코드:");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		textpanel1.add(lblNo);
		
		tfNo = new JTextField();
		textpanel1.add(tfNo);
		tfNo.setColumns(10);
		
		JLabel lblPrice = new JLabel("제품단가:");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		textpanel1.add(lblPrice);
		
		tfPrice = new JTextField();
		tfPrice.setColumns(10);
		textpanel1.add(tfPrice);
		
		JLabel lblSale = new JLabel("판매수량:");
		lblSale.setHorizontalAlignment(SwingConstants.RIGHT);
		textpanel1.add(lblSale);
		
		tfSale = new JTextField();
		tfSale.setColumns(10);
		textpanel1.add(tfSale);
		
		JLabel lblMargins = new JLabel("마진율:");
		lblMargins.setHorizontalAlignment(SwingConstants.RIGHT);
		textpanel1.add(lblMargins);
		
		tfMargins = new JTextField();
		tfMargins.setColumns(10);
		textpanel1.add(tfMargins);
		
		JPanel textpanel2 = new JPanel();
		textpanel.add(textpanel2);
		textpanel2.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel textpanel2_1 = new JPanel();
		textpanel2.add(textpanel2_1);
		textpanel2_1.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("제품명:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		textpanel2_1.add(lblName);
		
		tfName = new JTextField();
		textpanel2_1.add(tfName);
		tfName.setColumns(10);
		
		JPanel button_panel = new JPanel();
		contentPane.add(button_panel, BorderLayout.SOUTH);
		
		btn1 = new JButton("입력");
		btn1.addActionListener(this);
		button_panel.add(btn1);
		
		btn2 = new JButton("출력1");
		btn2.addActionListener(this);
		button_panel.add(btn2);
		
		btn3 = new JButton("출력2");
		btn3.addActionListener(this);
		button_panel.add(btn3);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
	}
	protected void actionPerformedBtn2(ActionEvent e) {
		SaleUI sale = new SaleUI();		
		sale.setVisible(true);
	}
	protected void actionPerformedBtn3(ActionEvent e) {
		Margins sale = new Margins();
		sale.setVisible(true);
	}
	protected void actionPerformedBtn1(ActionEvent e) {
		if(!(isEmpty())) {
			getdate();
			isEmptyValue();
			
		}else {
			JOptionPane.showMessageDialog(null, "모든 항목을 입력해주세요");
		}
	}

	private void getdate() {
		String code = tfNo.getText();
		String name = tfName.getText();
		int price = Integer.parseInt(tfPrice.getText());
		int saleCnt = Integer.parseInt((tfSale.getText()));
		int marginRate = Integer.parseInt(tfMargins.getText());
		
		Product product = new Product(code,name);
		ProductService.insertProduct(product);
		
		Sale sale = new Sale(new Product(code),price,saleCnt,marginRate);
		SaleService.insertSale(sale);
		
	
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return tfNo.getText().equals("") || tfName.getText().equals("") ||tfPrice.getText().equals("") || 
				tfSale.getText().equals("") || tfMargins.getText().equals("");
	}

	private void isEmptyValue() {
		// TODO Auto-generated method stub
		tfNo.setEditable(true);
		tfNo.setText("");
		tfName.setText("");
		tfPrice.setText("");
		tfSale.setText("");
		tfMargins.setText("");
		tfNo.requestFocus();
	}
}


















