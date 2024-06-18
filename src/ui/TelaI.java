package ui;

import Dados.ACMERobots;
import Dados.Industrial;
import Dados.Robo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaI {
    ACMERobots acmeRobots;
    private Aplicacao aplicacao ;
    private JPanel panel1;
    private JTextField setorField;
    private JButton cadastrarButton;
    private JLabel imgRoboField;
    private JButton fecharButton;
    private JTextArea estadoArea;
    private JTextField idField;
    private JTextField modeloField;
    private JButton menuRobosButton;


    public TelaI(Aplicacao app,ACMERobots robots) {
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
                    String setor = setorField.getText();
                    Industrial robo = new Industrial(id, modelo, setor);
                    if (acmeRobots.adicionarRobo(robo)){
                        JOptionPane.showMessageDialog(aplicacao, "Robo industrial cadastrado com sucesso!");
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
        return panel1;
    }
}
