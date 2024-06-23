package ui;

import Dados.ACMERobots;
import Dados.Robo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;

public class Tela1 {
    private ACMERobots acmeRobots = new ACMERobots();
    private List<Robo> listaRobos;
    private JPanel panel1;
    private JButton limparButton;
    private JButton fecharButton;
    private JTextArea estadoArea;
    private JButton exibirButton;
    private JButton domesticoButton;
    private JButton agricolaButton;
    private JButton industrialButton;
    private JLabel imgRoboField;

    public Tela1(Aplicacao app, ACMERobots robots) {
        acmeRobots = robots;
        listaRobos = acmeRobots.getListaRobos();


        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estadoArea.setText("");
            }
        });

        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    estadoArea.setText("");
                    listaRobos.stream()
                            .sorted(Comparator.comparingInt(Robo::getId))
                            .forEach(a -> estadoArea.append(a.toString() + "\n"));
                }catch (NullPointerException e1) {
                    estadoArea.setText("Adicione pelo menos 1 Robo!");
                }
            }
        });
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        domesticoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.mudaPainel(2);
            }
        });

        industrialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.mudaPainel(4);
            }
        });
        agricolaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.mudaPainel(3);
            }
        });
    }

    public JPanel getPainel() {
        estadoArea.setText("");
        return panel1;
    }
}
