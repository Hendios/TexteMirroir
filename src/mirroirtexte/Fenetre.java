package mirroirtexte;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
Nom:    Fazzi
Prénom: Enzo

Classe: Fenetre
*/

public class Fenetre extends JFrame{
    
    private JPanel main = new JPanel();
    private JTextField text = new JTextField();
    private JTextField mirrorText = new JTextField();
    
    
    public Fenetre(){
        super();
        
        this.setTitle("Mirroir à texte");
        this.setSize(800, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        text.setText("");
        mirrorText.setText("");
        mirrorText.setEditable(false);
        
        text.setPreferredSize(new Dimension(500, 25));
        mirrorText.setPreferredSize(new Dimension(500, 25));
        
        main.add(text);
        main.add(mirrorText);
        
        text.getDocument().addDocumentListener(new mirrorText());    
        
        this.setContentPane(main);
        this.setVisible(true);
        
    }
    
    class mirrorText implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            mirrorText.setText(text.getText());
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            mirrorText.setText(text.getText());
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            mirrorText.setText(text.getText());
        }
    }
}
