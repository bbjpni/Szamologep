package com.bzsomi.Szamologep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class szamologep extends JFrame implements ActionListener{

    JPanel panel;
    JTextField elso, masodik, eredmeny;
    JButton szorzas, osztas, mosztas, osszeadas, kivonas;

    public szamologep(){ init(); }

    private void init(){
        this.setTitle("Számológép");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        elso = new JTextField();
        elso.setBounds(40,40,240,30);

        masodik = new JTextField();
        masodik.setBounds(320,40,240,30);

        szorzas = new JButton("*");
        szorzas.setBounds(40,150,60,50);

        osztas = new JButton("/");
        osztas.setBounds(155,150,60,50);

        mosztas = new JButton("%");
        mosztas.setBounds(270,150,60,50);

        osszeadas = new JButton("+");
        osszeadas.setBounds(385,150,60,50);

        kivonas = new JButton("-");
        kivonas.setBounds(500,150,60,50);

        eredmeny = new JTextField();
        eredmeny.setBounds(40,100,520,30);
        eredmeny.enable(false);

        panel = (JPanel) (this.getContentPane());
        this.setLayout(null);

        panel.add(elso);
        panel.add(masodik);
        panel.add(eredmeny);
        panel.add(szorzas);
        panel.add(osztas);
        panel.add(mosztas);
        panel.add(osszeadas);
        panel.add(kivonas);

        szorzas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int elsoSzam;
                int masodikSzam;
                try {
                    eredmeny.setText("");
                    elsoSzam = elso.getText().trim().equals("") ? 0 : Integer.parseInt(elso.getText());
                    masodikSzam = masodik.getText().trim().equals("") ? 0 : Integer.parseInt(masodik.getText());
                    eredmeny.setText((elsoSzam*masodikSzam)+"");
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Csak egész számmal tudsz műveletet elvégezni!");
                }
            }
        });

        osztas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int elsoSzam;
                int masodikSzam;
                try {
                    eredmeny.setText("");
                    elsoSzam = elso.getText().trim().equals("") ? 0 : Integer.parseInt(elso.getText());
                    masodikSzam = masodik.getText().trim().equals("") ? 1 : Integer.parseInt(masodik.getText());
                    if (masodikSzam == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Nullával nem lehet osztani!");
                        return;
                    }
                    eredmeny.setText((elsoSzam/masodikSzam)+"");
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Csak egész számmal tudsz műveletet elvégezni!");
                }
            }
        });

        mosztas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int elsoSzam;
                int masodikSzam;
                try {
                    eredmeny.setText("");
                    elsoSzam = elso.getText().trim().equals("") ? 0 : Integer.parseInt(elso.getText());
                    masodikSzam = masodik.getText().trim().equals("") ? 1 : Integer.parseInt(masodik.getText());
                    if (masodikSzam == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Nullával nem lehet osztani!");
                        return;
                    }
                    eredmeny.setText((elsoSzam%masodikSzam)+"");
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Csak egész számmal tudsz műveletet elvégezni!");
                }
            }
        });

        osszeadas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int elsoSzam;
                int masodikSzam;
                try {
                    eredmeny.setText("");
                    elsoSzam = elso.getText().trim().equals("") ? 0 : Integer.parseInt(elso.getText());
                    masodikSzam = masodik.getText().trim().equals("") ? 0 : Integer.parseInt(masodik.getText());
                    eredmeny.setText((elsoSzam+masodikSzam)+"");
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Csak egész számmal tudsz műveletet elvégezni!");
                }
            }
        });

        kivonas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int elsoSzam;
                int masodikSzam;
                try {
                    eredmeny.setText("");
                    elsoSzam = elso.getText().trim().equals("") ? 0 : Integer.parseInt(elso.getText());
                    masodikSzam = masodik.getText().trim().equals("") ? 0 : Integer.parseInt(masodik.getText());
                    eredmeny.setText((elsoSzam-masodikSzam)+"");
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Csak egész számmal tudsz műveletet elvégezni!");
                }
            }
        });

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
