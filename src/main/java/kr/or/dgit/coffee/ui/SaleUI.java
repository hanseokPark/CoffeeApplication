package kr.or.dgit.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class SaleUI extends JFrame {

	private JPanel contentPane;
	
	private static Object[][] rowdata;
	private static final String[] columnNames = { "순위", "제품코드", "제품명", "제품단가",
	            "판매수량", "공급가액", "부가세액", "판매금액", "마진율", "마진액" };
	
	
	
	
	public SaleUI() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 789, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("판매 금액 순위");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		
        
        tableset(); 		
		
		
	}

	private void tableset() {
		DefaultTableModel model = new DefaultTableModel(rowdata,columnNames);//모델과 데이터를 연결해줌
        //데이터를 복사해서 추가한 것이 아닌 링크해서 추가한 것이다.
        //모델을 안쓰게되면 새로만들어야한다.
        
        JTable table = new JTable(model); //
        
        JScrollPane sc = new JScrollPane(table);
       
        //컬럼 중앙정렬
        DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
        celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer celAlignRight = new DefaultTableCellRenderer();
        celAlignRight.setHorizontalAlignment(JLabel.RIGHT);
        DefaultTableCellRenderer celAlignLeft = new DefaultTableCellRenderer();
        celAlignLeft.setHorizontalAlignment(JLabel.LEFT);
        
        
        //데이터를 바꾸고싶다면 요래하기때문에 테이블을 안건들인다  ..
        //테이블에 직접 접근하지 않고 가능 !
        
        getContentPane().add(sc);
        setBounds(0, 0, 1000, 500);
        setVisible(true);
	}

}
