package br.com.phoenix.client.ui.customers;

import br.com.phoenix.client.model.Customer;
import br.com.phoenix.client.net.ApiHttpClient;
import br.com.phoenix.client.service.CustomerService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomersPanel extends javax.swing.JPanel {

    private final CustomerService service;
    private final DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Name", "Email", "Phone"}, 0);

    public CustomersPanel(ApiHttpClient http) {
        this.service = new CustomerService(http);
        initComponents();
        jTableClientes.setDefaultEditor(Object.class, null);
        btnRefresh.addActionListener(e -> refresh());
        btnSave.addActionListener(e -> onSave());
        btnDelete.addActionListener(e -> onDelete());
        colunmSize();
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jTableClientes.setModel(model);
        jTableClientes.setShowGrid(true);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableClientes);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Nome");

        jLabel2.setText("Email");

        btnSave.setText("Save");

        btnDelete.setText("Delete");

        btnRefresh.setText("Refresh");

        jLabel3.setText("Phone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addComponent(txtPhone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void refresh() {
        try {
            model.setRowCount(0);
            List<Customer> list = service.list();
            for (Customer c : list) {
                model.addRow(new Object[]{c.id, c.name, c.email, c.phone});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha ao listar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onSave() {
        try {
            String name = txtName.getText() != null ? txtName.getText().trim() : "";
            String email = txtEmail.getText() != null ? txtEmail.getText().trim() : "";
            String phone = txtPhone.getText() != null ? txtPhone.getText().trim() : "";

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o nome.", "Validação", JOptionPane.WARNING_MESSAGE);
                txtName.requestFocus();
                return;
            }
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o e-mail.", "Validação", JOptionPane.WARNING_MESSAGE);
                txtEmail.requestFocus();
                return;
            }
            if (phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o telefone.", "Validação", JOptionPane.WARNING_MESSAGE);
                txtPhone.requestFocus();
                return;
            }

            int sel = jTableClientes.getSelectedRow();
            if (sel >= 0) {
                Long id = (Long) model.getValueAt(sel, 0);
                service.update(id, name, email, phone);
            } else {
                service.create(name, email, phone);
            }
            txtName.setText("");
            txtEmail.setText("");
            txtPhone.setText("");
            refresh();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha ao salvar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onDelete() {
        try {
            int sel = jTableClientes.getSelectedRow();
            if (sel >= 0) {
                Long id = (Long) model.getValueAt(sel, 0);
                service.delete(id);
                refresh();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha ao excluir: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JTable getjTableClientes() {
        return jTableClientes;
    }

    private void colunmSize() {
        jTableClientes.getColumnModel().getColumn(0).setMinWidth(10);
        jTableClientes.getColumnModel().getColumn(0).setMaxWidth(35);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(20);

        jTableClientes.getColumnModel().getColumn(1).setMinWidth(130);
        jTableClientes.getColumnModel().getColumn(1).setMaxWidth(400);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(140);

        jTableClientes.getColumnModel().getColumn(2).setMinWidth(130);
        jTableClientes.getColumnModel().getColumn(2).setMaxWidth(400);
        jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(140);

        jTableClientes.getColumnModel().getColumn(3).setMinWidth(100);
        jTableClientes.getColumnModel().getColumn(3).setMaxWidth(400);
        jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

}
