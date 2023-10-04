package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class SolucionForm extends JFrame{
    private JTextField textField1;
    private JButton runButton;
    private JPanel MainPanel;
    private JLabel titleLabel;
    private JScrollPane scrollPane1;
    private JTable table1;


    public void openForm(){
        setTitle("Simulacion");
        setVisible(true);
        setSize(500,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(MainPanel);
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("N");
        model.addColumn("X1");
        model.addColumn("X2");
        model.addColumn("Z");
        table1.setModel(model);
        runButton.addActionListener(e -> {
            int nmi = Integer.parseInt(textField1.getText());
            SolucionDto solution = Simulacion.obtenerSolucion(nmi);
            model.addRow(new Object[]{model.getRowCount()+1,solution.getX1(),solution.getX2(),solution.getZ()});

        });
    }

}
