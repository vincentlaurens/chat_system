package com.vincentlaurens.insa.ui.view;


import com.vincentlaurens.insa.ui.controller.DialoguePageController;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.awt.*;

public class DialoguePageViewer extends JFrame{
    private  DialoguePageController presenter = new DialoguePageController();
    private  JPanel chat = new JPanel();
    private JPanel contentPane = new JPanel();
    private  JTree usersConnectees = new JTree();;
    private  JTextField affichageMessage = new JTextField();
    private  JTextField ecrireMessage = new JTextField();

    public DialoguePageViewer(String pseudo)throws HeadlessException {
        super();
        build(pseudo);

    }
    private void build(String pseudo){
        setTitle("Chat System : Bonjour " + pseudo); //On donne un titre à l'application
        setSize(320,240); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        this.usersConnectees.setRootVisible(true);
        this.usersConnectees.setSize(100,100);

        this.affichageMessage.setEditable(false);
        this.affichageMessage.setSize(300,70);
        this.ecrireMessage.setEditable(true);
        this.ecrireMessage.setSize(300, 30);


        this.chat.add(this.affichageMessage, JFrame.TOP_ALIGNMENT);
        this.chat.add(this.ecrireMessage, JFrame.BOTTOM_ALIGNMENT);
        this.chat.setVisible(true);


        this.contentPane.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        this.contentPane.add(this.usersConnectees, JFrame.LEFT_ALIGNMENT);
        this.contentPane.add(this.chat,JFrame.RIGHT_ALIGNMENT);



        this.setContentPane(this.contentPane);

}

    public void display() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

