package br.com.phoenix.client.ui.orders;

import br.com.phoenix.client.net.ApiHttpClient;
import br.com.phoenix.client.ui.customers.CustomersDialog;

public class OrdersPanel extends javax.swing.JPanel {
    
    private final ApiHttpClient http;
    
    public OrdersPanel(ApiHttpClient http) {
        this.http = http;
        initComponents();
        jTable1.setTableHeader(null);
        jTable2.setTableHeader(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneOrcTotal = new javax.swing.JTabbedPane();
        painelItemOrcamento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaOrcPrincipal = new javax.swing.JTable();
        TextFieldQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelTipoOrcamento = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PainelAcabamentoMontagem = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAcabamentos = new javax.swing.JTable();
        painelMontagem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaParametros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCalculosExtras = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaCalculos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jTabbedPaneDetalhes = new javax.swing.JTabbedPane();
        painelDetalhes01 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButtonPrecoOrc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        comboBoxTipoDeOrcamento = new javax.swing.JComboBox<>();
        jTextField23 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabelClienteOrcamento3 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        comboBoxClientes = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        tabelaOrcPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", null, null, null, null, null, null, null},
                {"02", null, null, null, null, null, null, null},
                {"03", null, null, null, null, null, null, null},
                {"04", null, null, null, null, null, null, null},
                {"05", null, null, null, null, null, null, null},
                {"06", null, null, null, null, null, null, null},
                {"07", null, null, null, null, null, null, null},
                {"08", null, null, null, null, null, null, null},
                {"09", null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Planos(=qtd)", "LxA(cm)", "Mont.", "Págs", "Cor", "Material", "Parâmetros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaOrcPrincipal.setCellSelectionEnabled(true);
        tabelaOrcPrincipal.setRowHeight(21);
        tabelaOrcPrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaOrcPrincipal.setShowGrid(true);
        tabelaOrcPrincipal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaOrcPrincipal);
        if (tabelaOrcPrincipal.getColumnModel().getColumnCount() > 0) {
            tabelaOrcPrincipal.getColumnModel().getColumn(0).setPreferredWidth(2);
            tabelaOrcPrincipal.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaOrcPrincipal.getColumnModel().getColumn(2).setPreferredWidth(85);
            tabelaOrcPrincipal.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabelaOrcPrincipal.getColumnModel().getColumn(4).setPreferredWidth(45);
            tabelaOrcPrincipal.getColumnModel().getColumn(5).setPreferredWidth(45);
            tabelaOrcPrincipal.getColumnModel().getColumn(6).setPreferredWidth(90);
            tabelaOrcPrincipal.getColumnModel().getColumn(7).setPreferredWidth(75);
        }

        TextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setText(" Quantidade");

        jLabelTipoOrcamento.setText(" Tipo de Orçamento ()");

        jLabel3.setText(" Título do serviço");

        tabelaAcabamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", null, null},
                {"02", null, null},
                {"03", null, null},
                {"04", null, null},
                {"05", null, null},
                {"06", null, null},
                {"07", null, null},
                {"08", null, null},
                {"09", null, null},
                {"10", null, null},
                {"11", null, null},
                {"12", null, null},
                {"13", null, null},
                {"14", null, null},
                {"15", null, null},
                {"16", null, null},
                {"17", null, null},
                {"18", null, null},
                {"19", null, null},
                {"20", null, null}
            },
            new String [] {
                "", "AC=Acabamentos", "Plano(s)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAcabamentos.setCellSelectionEnabled(true);
        tabelaAcabamentos.setRowHeight(21);
        tabelaAcabamentos.setShowGrid(true);
        tabelaAcabamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaAcabamentos);
        tabelaAcabamentos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabelaAcabamentos.getColumnModel().getColumnCount() > 0) {
            tabelaAcabamentos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaAcabamentos.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabelaAcabamentos.getColumnModel().getColumn(2).setPreferredWidth(110);
        }

        javax.swing.GroupLayout painelMontagemLayout = new javax.swing.GroupLayout(painelMontagem);
        painelMontagem.setLayout(painelMontagemLayout);
        painelMontagemLayout.setHorizontalGroup(
            painelMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelMontagemLayout.setVerticalGroup(
            painelMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        tabelaParametros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Parâmetros", "Valor"
            }
        ));
        tabelaParametros.setCellSelectionEnabled(true);
        tabelaParametros.setRowHeight(21);
        tabelaParametros.setShowGrid(true);
        tabelaParametros.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaParametros);

        tabelaCalculosExtras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cálculos Extras", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCalculosExtras.setCellSelectionEnabled(true);
        tabelaCalculosExtras.setRowHeight(21);
        tabelaCalculosExtras.setShowGrid(true);
        tabelaCalculosExtras.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabelaCalculosExtras);
        tabelaCalculosExtras.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabelaCalculosExtras.getColumnModel().getColumnCount() > 0) {
            tabelaCalculosExtras.getColumnModel().getColumn(0).setPreferredWidth(215);
            tabelaCalculosExtras.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        jCheckBox3.setText("jCheckBox3");

        jCheckBox4.setText("jCheckBox4");

        jCheckBox5.setText("jCheckBox5");

        jCheckBox6.setText("jCheckBox6");

        jCheckBox7.setText("jCheckBox7");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelAcabamentoMontagemLayout = new javax.swing.GroupLayout(PainelAcabamentoMontagem);
        PainelAcabamentoMontagem.setLayout(PainelAcabamentoMontagemLayout);
        PainelAcabamentoMontagemLayout.setHorizontalGroup(
            PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelMontagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        PainelAcabamentoMontagemLayout.setVerticalGroup(
            PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcabamentoMontagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addGroup(PainelAcabamentoMontagemLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelMontagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Acabamentos/Montagem", PainelAcabamentoMontagem);

        tabelaCalculos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaCalculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Pl", "Processos calculados", "Quantidade", "Unid", "Pr. Unit.", "Custo", " *", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCalculos.setRowHeight(18);
        tabelaCalculos.setShowGrid(true);
        jScrollPane5.setViewportView(tabelaCalculos);
        if (tabelaCalculos.getColumnModel().getColumnCount() > 0) {
            tabelaCalculos.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabelaCalculos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaCalculos.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0,00");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.setFocusable(false);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 28));

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.setText("0,00");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField6.setFocusable(false);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 28));

        jTextField18.setEditable(false);
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField18.setText("0,00");
        jTextField18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField18.setFocusable(false);
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, 28));

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(255, 255, 0));
        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField19.setText("0,00");
        jTextField19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField19.setFocusable(false);
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 100, 28));

        jTextField20.setEditable(false);
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField20.setText("0,00");
        jTextField20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField20.setFocusable(false);
        jPanel3.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 90, 28));

        jTextField21.setEditable(false);
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField21.setText("0,00");
        jTextField21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField21.setFocusable(false);
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 110, 28));

        jTextField22.setEditable(false);
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField22.setText("0,00");
        jTextField22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField22.setFocusable(false);
        jPanel3.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, 28));

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel18.setText("Matéria Prima");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 80, -1));

        jLabel19.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel19.setText("  Serviços 3os");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 5, 80, -1));

        jLabel20.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel20.setText("  Produção");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 5, 80, -1));

        jLabel21.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel21.setText("Custo Total");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 5, 70, -1));

        jLabel22.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel22.setText(" Comissões");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 5, 60, -1));

        jLabel23.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel23.setText(" C. Marginal 0%");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 5, 90, -1));

        jLabel24.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jLabel24.setText(" CF atingido 34,7%");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 5, 100, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cálculos", jPanel4);

        jButton1.setText("Impressora : ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton3.setText("F2-Imprimir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton7.setText("Salvar Orç.");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton8.setText("F4-eMail");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton9.setText("F6-Visualizar");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton10.setText("Gerar OS");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 472, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel25.setText(" Itens a imprimir");

        jLabel26.setText(" Data do Orçamento");

        jTextField24.setText("13/03/2024");

        jTextField25.setEditable(false);
        jTextField25.setText("Qua");
        jTextField25.setFocusable(false);

        jTextField26.setEditable(false);
        jTextField26.setText("Vithor");
        jTextField26.setFocusable(false);

        jTextField27.setEditable(false);
        jTextField27.setText("Vithor");
        jTextField27.setFocusable(false);

        jLabel27.setText(" Incluído por");

        jLabel28.setText("Últ. mov. por");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel6.setOpaque(false);

        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Imprimir Carta Proposta");

        jCheckBox9.setText("Imprimir pré-cálculo");

        jCheckBox10.setText("Carta Resumida(Só observações)");

        jCheckBox11.setText("Totalizar valor dos itens");

        jCheckBox12.setSelected(true);
        jCheckBox12.setText("Gerar PDF da carta ao gravar (F3)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox11)
                .addGap(12, 12, 12)
                .addComponent(jCheckBox12)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel25)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28))))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Gravar", jPanel5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable1);

        javax.swing.GroupLayout painelDetalhes01Layout = new javax.swing.GroupLayout(painelDetalhes01);
        painelDetalhes01.setLayout(painelDetalhes01Layout);
        painelDetalhes01Layout.setHorizontalGroup(
            painelDetalhes01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        painelDetalhes01Layout.setVerticalGroup(
            painelDetalhes01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDetalhes01Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneDetalhes.addTab("01", painelDetalhes01);

        jButtonPrecoOrc.setText("F1");
        jButtonPrecoOrc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPrecoOrc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrecoOrc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel16.setText("Preço Venda");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel17.setText("Preço Unitário");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable2.setCellSelectionEnabled(true);
        jTable2.setShowGrid(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable2);

        jTextField7.setText("R$ 1.550,00");

        jTextField8.setText("R$ 10,00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButtonPrecoOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonPrecoOrc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        comboBoxTipoDeOrcamento.setEditable(true);
        comboBoxTipoDeOrcamento.setMaximumRowCount(0);
        comboBoxTipoDeOrcamento.setBorder(null);
        comboBoxTipoDeOrcamento.setLightWeightPopupEnabled(false);

        jTextField23.setEditable(false);
        jTextField23.setText("____");
        jTextField23.setFocusable(false);

        jTextField4.setEditable(false);
        jTextField4.setForeground(new java.awt.Color(120, 120, 120));
        jTextField4.setFocusable(false);

        jTextField5.setEditable(false);
        jTextField5.setForeground(new java.awt.Color(120, 120, 120));
        jTextField5.setFocusable(false);

        jLabel4.setText(" N° Orç + Item");

        jLabel5.setText(" N° OS");

        javax.swing.GroupLayout painelItemOrcamentoLayout = new javax.swing.GroupLayout(painelItemOrcamento);
        painelItemOrcamento.setLayout(painelItemOrcamentoLayout);
        painelItemOrcamentoLayout.setHorizontalGroup(
            painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItemOrcamentoLayout.createSequentialGroup()
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTabbedPaneDetalhes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItemOrcamentoLayout.createSequentialGroup()
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxTipoDeOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelItemOrcamentoLayout.setVerticalGroup(
            painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTipoOrcamento)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxTipoDeOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelItemOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItemOrcamentoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPaneDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );

        jTabbedPaneOrcTotal.addTab("01", painelItemOrcamento);

        add(jTabbedPaneOrcTotal, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setText(" Vendedor");
        jPanel11.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 60, 20));
        jPanel11.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 210, 20));

        jLabelClienteOrcamento3.setText(" Clientes ()");
        jPanel11.add(jLabelClienteOrcamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));
        jPanel11.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 210, 28));
        jPanel11.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 20));

        jLabel47.setText(" Contato");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 20));

        jLabel48.setText(" Agência");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 60, 20));

        jTextFieldPhone.setMinimumSize(new java.awt.Dimension(77, 22));
        jPanel11.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 150, 28));

        jLabel49.setText(" Fone");
        jPanel11.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -4, -1, 30));
        jPanel11.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 170, 20));

        jLabel50.setText(" Orçamento para");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 100, 20));
        jPanel11.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 150, 28));

        jLabel51.setText(" Celular/Watsapp");
        jPanel11.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 100, 20));
        jPanel11.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 330, 28));

        jLabel52.setText("Email");
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 0, 70, 20));

        jTextField51.setEditable(false);
        jTextField51.setForeground(new java.awt.Color(120, 120, 120));
        jTextField51.setText("14/03/2024-09:32");
        jTextField51.setFocusable(false);
        jPanel11.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, 122, 20));

        jLabel53.setText(" Últ. Movimento");
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 50, -1, 20));

        jTextField52.setEditable(false);
        jTextField52.setForeground(new java.awt.Color(120, 120, 120));
        jTextField52.setText("14/03/2024-09:32");
        jTextField52.setFocusable(false);
        jPanel11.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 70, 130, 20));

        jLabel54.setText(" Inclusão");
        jPanel11.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 50, 20));

        comboBoxClientes.setEditable(true);
        comboBoxClientes.setMaximumRowCount(0);
        comboBoxClientes.setBorder(null);
        comboBoxClientes.setKeySelectionManager(null);
        comboBoxClientes.setLightWeightPopupEnabled(false);
        comboBoxClientes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboBoxClientesPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel11.add(comboBoxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 22));

        add(jPanel11, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxClientesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboBoxClientesPopupMenuWillBecomeVisible
        CustomersDialog dialog = new CustomersDialog((java.awt.Window) null, http);
        dialog.doubleClick(comboBoxClientes, jTextFieldPhone);
        dialog.setVisible(true);
    }//GEN-LAST:event_comboBoxClientesPopupMenuWillBecomeVisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcabamentoMontagem;
    private javax.swing.JTextField TextFieldQuantidade;
    public static javax.swing.JComboBox<String> comboBoxClientes;
    public javax.swing.JComboBox<String> comboBoxTipoDeOrcamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonPrecoOrc;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabelClienteOrcamento3;
    public javax.swing.JLabel jLabelTipoOrcamento;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPaneDetalhes;
    private javax.swing.JTabbedPane jTabbedPaneOrcTotal;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JPanel painelDetalhes01;
    private javax.swing.JPanel painelItemOrcamento;
    private javax.swing.JPanel painelMontagem;
    private javax.swing.JTable tabelaAcabamentos;
    private javax.swing.JTable tabelaCalculos;
    private javax.swing.JTable tabelaCalculosExtras;
    private javax.swing.JTable tabelaOrcPrincipal;
    private javax.swing.JTable tabelaParametros;
    // End of variables declaration//GEN-END:variables

}
