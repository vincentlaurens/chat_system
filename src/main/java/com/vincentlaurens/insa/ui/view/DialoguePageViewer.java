package com.vincentlaurens.insa.ui.view;


import com.vincentlaurens.insa.ui.controller.DialoguePageController;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class DialoguePageViewer extends JFrame{
    private  DialoguePageController presenter = new DialoguePageController();
    private JTextArea textArea;
    private JTextField inputTextField;
    private JButton sendButton;
    private JTree listeUsersConnectes;

    public DialoguePageViewer(String pseudo)throws HeadlessException {
        super();
        build(pseudo);

    }
    private void build(String pseudo){
        setTitle("Chat System : Bonjour " + pseudo);
        setSize(600,300);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        textArea = new JTextArea(20, 50);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        Box box = Box.createHorizontalBox();
        add(box, BorderLayout.SOUTH);
        inputTextField = new JTextField();
        sendButton = new JButton("Envoyer");
        box.add(inputTextField);
        box.add(sendButton);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Utilisateurs Connectés");

        listeUsersConnectes = new JTree(root);
        add(new JScrollPane(listeUsersConnectes), BorderLayout.WEST);


}

    public void display() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

