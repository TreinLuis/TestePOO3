
import Dados.Locacao;
import Dados.Robo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Tela1 {
    Locacao locacao = new Locacao();
    private JTextField idField;

    private List<Robo> listaRobos;
    private JPanel panel1;
    private JTextField modeloField;
    private JTextField diariaField;
    private JButton limparButton;
    private JButton cadastrarButton;
    private JButton fecharButton;
    private JTextArea estadoArea;
    private JButton exibirButton;
    private JLabel imgRoboField;

    public Tela1() {
        List<Robo> listaRobos = new ArrayList<>();


        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseInt(idField.getText());
                    String modelo = modeloField.getText();
                    double valorDiaria = Double.parseDouble(diariaField.getText());
                    idField.setText("");
                    modeloField.setText("");
                    estadoArea.setText("");
                    diariaField.setText("");

                    Robo robo = new Robo(id, modelo, valorDiaria);
                    if (!locacao.adicionarRobo(robo)) {
                        estadoArea.setText("Erro ao cadastrar!!\nRobo já cadastrado!!");
                    } else {
                        estadoArea.setText("");
                        estadoArea.setText("Cadastro concluido!!");
                        listaRobos.add(robo);
                    }
                } catch (NumberFormatException a){
                    estadoArea.setText("Erro ao cadastrar!");
                    estadoArea.append("\nPor favor Verifique se digitou os campos corretamente");
                    estadoArea.append("\nId = Números\nModelo = Texto\nValor = Número");


                }
            }
        });


        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idField.setText("");
                modeloField.setText("");
                diariaField.setText("");
                estadoArea.setText("");

            }
        });

        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(listaRobos.size() == 0){
                    estadoArea.setText("Adicione pelo menos 1 Robo!");
                }
                estadoArea.setText("");
                listaRobos.forEach(a -> estadoArea.append(a.toString() + "\n"));
            }
        });
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getPainel() {
        return panel1;
    }
}
