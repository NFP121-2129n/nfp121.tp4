package question2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextArea;

public class JButtonObserver implements ActionListener{

    private String nom;
    private TextArea contenu;

    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    public void actionPerformed(ActionEvent e) {
        String message = "observateur " + this.nom + ":click du button " + e.getActionCommand();
        contenu.append(message + "\n");
    }

}

