package com.vincentlaurens.insa.ui.controller;

import com.vincentlaurens.insa.network.Infrastructure.ChatManager;
import com.vincentlaurens.insa.ui.view.DialoguePageViewer;
import com.vincentlaurens.insa.ui.view.ErrorViewer;
import com.vincentlaurens.insa.ui.view.PseudoPageViewer;

import javax.swing.*;

public class PseudoPageController {

    private ErrorViewer errorViewer  = new ErrorViewer();
    private ChatManager chatManager = new ChatManager();

    public void onEntercheckPseudo(String newPseudo, JButton btn){
        if (newPseudo.isEmpty()){
            this.errorViewer.WarningViewer("Les champs pseudo est obligatoire!!!!!");
        }else {
            this.errorViewer.WarningViewer("Login Disponible!!!");
            btn.setEnabled(true);
        }

    }

    public void onChatOuvertureButtonClicked(String pseudo, JFrame parent) {
        chatManager.addPseudotoUser(pseudo);
        DialoguePageViewer dialoguePageViewer = new DialoguePageViewer(pseudo);
        parent.dispose();
        dialoguePageViewer.display();

        //this.errorViewer.WarningViewer("Ouverture Page de chat!!!");
    }
}
