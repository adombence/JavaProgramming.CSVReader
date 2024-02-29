package javaProgramming.GUI;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;

public class EmpList extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private EmpTM etm;
	
	public EmpList(JFrame f, EmpTM tm) {
		super(f, "Dolgozók listája", true);
		etm = tm;

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(175, 227, 89, 23);
		getContentPane().add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 195);
		getContentPane().add(scrollPane);
		
		table = new JTable(etm);
		scrollPane.setViewportView(table);

		TableColumn tColumn = null;
		
		for (int i = 0; i < 6; i++) {
			tColumn = table.getColumnModel().getColumn(i);
			
			if (i == 0 || i == 1) {
				tColumn.setPreferredWidth(30);
			} else if (i == 4) {
				tColumn.setPreferredWidth(150);
			} else {
				tColumn.setPreferredWidth(100);
			}
		}
		
		table.setAutoCreateRowSorter(true);
		TableRowSorter<EmpTM> tRows = (TableRowSorter<EmpTM>)table.getRowSorter();
		tRows.setSortable(0, false);
	}
}
