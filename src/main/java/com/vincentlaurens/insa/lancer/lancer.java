package com.vincentlaurens.insa.lancer;

import com.vincentlaurens.insa.ui.view.LoginPageViewer;

import java.awt.*;
import javax.swing.*;

public class lancer {


    public static void main (String[] args){
        JFrame frame = new JFrame();

        LoginPageViewer loginDlg = new LoginPageViewer(frame);
        loginDlg.setVisible(true);
        loginDlg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
