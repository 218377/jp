package lab03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class MFrame extends JFrame {
	static Calendar curr_t;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtType;
	private JTextField txtQuantity;
	private JTextField txtStreet;
	private JTextField rt;
	private JTextField txtHome;
	private JTextField txtCity;
	private JTextField txtCompany;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//calendar initialization
		curr_t = Calendar.getInstance();
		curr_t.set(Calendar.HOUR_OF_DAY, 10);
		curr_t.set(Calendar.MINUTE, 00);
		curr_t.set(Calendar.SECOND, 00);
		Order orders[];
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MFrame frame = new MFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		flowLayout_1.setVgap(10);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JLabel time_label = new JLabel("Current Time");
		time_label.setText(curr_t.getTime().toString());
		time_label.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(time_label);
		
		JButton time_btn = new JButton("Time forward");
		time_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				curr_t.set(Calendar.MINUTE, (curr_t.get(Calendar.MINUTE)+30));
				time_label.setText(curr_t.getTime().toString());
			}
		});
		panel_2.add(time_btn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Orders", null, panel_1, null);
		
		table = new JTable();
		
		@SuppressWarnings("serial")
		DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Pizzas", "Adress", "Time", "ID"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		table.setModel(model);
		panel_1.add(table);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Realizacja", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Add", null, panel_4, null);
		
		txtType = new JTextField();
		txtType.setText("Type");
		panel_4.add(txtType);
		txtType.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.setText("Quantity");
		panel_4.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		txtStreet = new JTextField();
		txtStreet.setText("Street");
		panel_4.add(txtStreet);
		txtStreet.setColumns(10);
		
		txtHome = new JTextField();
		txtHome.setText("Home");
		txtHome.setColumns(10);
		panel_4.add(txtHome);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setColumns(10);
		panel_4.add(txtCity);
		
		txtCompany = new JTextField();
		txtCompany.setText("Company");
		txtCompany.setColumns(10);
		panel_4.add(txtCompany);
		
		rt = new JTextField();
		rt.setText("Realizing time");
		panel_4.add(rt);
		rt.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Pizza t_pizza = new Pizza(Integer.parseInt(txtType.getText()),Integer.parseInt(txtQuantity.getText()));
				Address t_adr = new Address(txtStreet.getText(), txtHome.getText(), txtCity.getText(),txtCompany.getText());
				Calendar o_t = Calendar.getInstance();
				o_t = curr_t;
				o_t.set(Calendar.MINUTE, (o_t.get(Calendar.MINUTE)+Integer.parseInt(rt.getText())));
				orders[0] = new Order();
				model.addRow(new Object[]{});
			}
		});
		panel_4.add(btnAdd);
	}

}
