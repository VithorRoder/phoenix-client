package br.com.phoenix.client;

import br.com.phoenix.client.ui.LoginFrame;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        FlatArcIJTheme.setup();
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
