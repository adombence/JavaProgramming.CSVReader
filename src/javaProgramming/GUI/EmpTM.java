package javaProgramming.GUI;

import javax.swing.table.DefaultTableModel;

public class EmpTM extends DefaultTableModel {
	 
	public EmpTM(Object fieldNames[], int rows) {
		super(fieldNames, rows);
	}
	
	public boolean isCellEditable(int row, int col) {
		if (col == 0) {
			return true;
		}
		
		return false;
	}
	
	public Class<?> getColumnClass(int index) {
		if (index == 0) {
			return Boolean.class;
		} else if(index == 1 || index == 5) {
			return Integer.class;
		}
		
		return String.class;
	}
}
