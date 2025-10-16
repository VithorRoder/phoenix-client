package br.com.phoenix.client.ui.quote.type;

import br.com.phoenix.client.model.QuoteType;
import br.com.phoenix.client.net.ApiHttpClient;
import br.com.phoenix.client.service.QuoteTypeService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuoteTypePanel extends javax.swing.JPanel {

    private final QuoteTypeService service;
    private final DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Tipo de Orçamento"}, 0);

    public QuoteTypePanel(ApiHttpClient http) {
        this.service = new QuoteTypeService(http);
        initComponents();
        jTableQuoteType.setDefaultEditor(Object.class, null);
        jButtonRefresh.addActionListener(e -> refresh());
        jButtonDelete.addActionListener(e -> onDelete());
        jButtonSave.addActionListener(e -> onSave());
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuoteType = new javax.swing.JTable();
        jTextFieldNomeTipoOrcamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();

        jTableQuoteType.setModel(model);
        jScrollPane1.setViewportView(jTableQuoteType);
        if (jTableQuoteType.getColumnModel().getColumnCount() > 0) {
            jTableQuoteType.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableQuoteType.getColumnModel().getColumn(1).setPreferredWidth(1450);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1543, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        jLabel1.setText("Nome do tipo de orçamento");

        jButtonSave.setText("Save");

        jButtonDelete.setText("Delete");

        jButtonRefresh.setText("Refresh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNomeTipoOrcamento)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSave)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeTipoOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonRefresh))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refresh() {
        try {
            model.setRowCount(0);
            List<QuoteType> list = service.list();
            for (QuoteType c : list) {
                model.addRow(new Object[]{c.id, c.name});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha ao listar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onSave() {
        try {
            String name = jTextFieldNomeTipoOrcamento.getText() != null ? jTextFieldNomeTipoOrcamento.getText().trim() : "";

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o nome.", "Validação", JOptionPane.WARNING_MESSAGE);
                jTextFieldNomeTipoOrcamento.requestFocus();
                return;
            }

            int sel = jTableQuoteType.getSelectedRow();
            if (sel >= 0) {
                Long id = (Long) model.getValueAt(sel, 0);
                service.update(id, name);
            } else {
                service.create(name);
            }
            jTextFieldNomeTipoOrcamento.setText("");
            refresh();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha ao salvar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onDelete() {
        try {
            int sel = jTableQuoteType.getSelectedRow();
            if (sel >= 0) {
                Long id = (Long) model.getValueAt(sel, 0);
                service.delete(id);
                refresh();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha ao excluir: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQuoteType;
    private javax.swing.JTextField jTextFieldNomeTipoOrcamento;
    // End of variables declaration//GEN-END:variables
}
