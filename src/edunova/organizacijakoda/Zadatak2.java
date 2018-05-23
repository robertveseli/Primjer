package edunova.organizacijakoda;

import javax.swing.JOptionPane;

public class Zadatak2 {
	public static void main(String[] args) {
		
		float i,j;
		
		i= Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj:"));
		j= Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj:"));
		
		System.out.println(i + "\t" + j);

	}
}
