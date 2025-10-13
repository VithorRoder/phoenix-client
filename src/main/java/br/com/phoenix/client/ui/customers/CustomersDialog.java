package br.com.phoenix.client.ui.customers;

import br.com.phoenix.client.net.ApiHttpClient;
import br.com.phoenix.client.service.CustomerService;
import java.awt.BorderLayout;
import java.awt.Window;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CustomersDialog extends JDialog {

    private final CustomerService service;
    private final JTable tabela;

    public CustomersDialog(Window parent, ApiHttpClient http) {
        super(parent, "Selecionar Cliente", ModalityType.APPLICATION_MODAL);
        this.service = new CustomerService(http);

        CustomersPanel cp = new CustomersPanel(http);
        this.tabela = cp.getjTableClientes();

        JScrollPane scroll = new JScrollPane(tabela);

        getContentPane().add(scroll, BorderLayout.CENTER);

        setSize(600, 400);
        setLocationRelativeTo(parent);
    }

    public JTable getTable() {
        return tabela;
    }

    public void doubleClick(JComboBox<String> comboBox, JTextField textFieldPhone, JTextField textFieldEmail) {
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2 && tabela.getSelectedRow() != -1) {
                    int row = tabela.getSelectedRow();

                    Object valorNome = tabela.getValueAt(row, 1);
                    Object valorEmail = tabela.getValueAt(row, 2);
                    Object valorPhone = tabela.getValueAt(row, 3);

                    if (valorNome != null && valorPhone != null && valorEmail != null) {
                        String textoNome = valorNome.toString();
                        String textoEmail = valorEmail.toString();
                        String textoPhone = valorPhone.toString();
                        comboBox.setSelectedItem(textoNome);
                        textFieldEmail.setText(textoEmail);
                        textFieldPhone.setText(textoPhone);
                        dispose();
                    }
                }
            }
        });
    }
}
