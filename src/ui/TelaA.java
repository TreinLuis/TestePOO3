package ui;

import Dados.ACMERobots;
import Dados.Agricola;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaA {
    ACMERobots acmeRobots;
    private Aplicacao aplicacao ;
    private JButton cadastrarButton;
    private JButton fecharButton;
    private JTextArea estadoArea;
    private JTextField idField;
    private JTextField modeloField;
    private JButton menuRobosButton;
    private JTextField usoField;
    private JTextField areaField;
    private JPanel painel1;
    private JLabel imgRoboField;


    public TelaA(Aplicacao app,ACMERobots robots) {
        aplicacao = app;
        acmeRobots = robots;

        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseInt(idField.getText());
                    String modelo = modeloField.getText();
                    String uso = usoField.getText();
                    double area = Double.parseDouble(areaField.getText());
                    Agricola robo = new Agricola(id, modelo,area,uso);
                    if (acmeRobots.adicionarRobo(robo)){
                        JOptionPane.showMessageDialog(aplicacao, "Robo agricola cadastrado com sucesso!");
                        estadoArea.setText(robo.toString());
                    } else {
                        JOptionPane.showMessageDialog(aplicacao, "Id já existente!");
                    }
                } catch(NumberFormatException npe){
                    JOptionPane.showMessageDialog(aplicacao, "Insira os valores corretamente");
                    estadoArea.setText("Id deve receber inteiros\nModelo deve ser caracteres\nNivel deve inteiros de 1 a 3");
                }
            }
        });
        menuRobosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(1);
            }
        });
    }

    public JPanel getPainel() {
        estadoArea.setText("");
        return painel1;
    }
}
