package com.vincentlaurens.insa.lancer;

import com.vincentlaurens.insa.ui.DialoguePage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.*;

public class lancer {


    public static void main (String[] args){
        Frame frame = new Frame();

        DialoguePage loginDlg = new DialoguePage(frame);
        loginDlg.setVisible(true);
        loginDlg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
