//
//import Dados.Robo;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Tela1 {
//    private JPanel painel;
//    private JTextField campo;
//    private JButton botaoConfirma;
//    private JButton botaoLimpa;
//    private JButton botaoSair;
//    private JTextArea area;
//    private JTextField Nome;
//    private JButton Mostrar;
//    private JRadioButton radioButton1;
//    private JTextField textField1;
//    private JRadioButton radioButton2;
//    private JRadioButton radioButton3;
//
//    private List<Robo> listaRobos;
//
//    public Tela1() {
//        listaRobo=new ArrayList<>();
//
//
//
//        botaoConfirma.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String codigo = campo.getText();
//                String nome = Nome.getText();
//                int codigoI= Integer.valueOf(codigo);
//                campo.setText("");
//                Nome.setText("");
//                area.setText("");
//
//                Robo robo = new Robo(codigoI,nome);
//                if(!cadastraMidia(robo)){
//                    area.setText("Erro ao cadastrar!!");
//                }else{
//                    area.setText("");
//                    area.setText("Cadastro concluido!!");
//                }
//            }
//        });
//
//
//
//        botaoLimpa.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                campo.setText("");
//                Nome.setText("");
//                area.setText("");
//
//            }
//        });
//
//
//
//
//        Mostrar.addActionListener(new ActionListener() {
//            @Override
//
//
//            public void actionPerformed(ActionEvent e) {
//                campo.setText("");
//                Nome.setText("");
//                area.setText("");
//                for(Cliente a : lista){
//                    area.append(a.toString()+"\n");
//                }
//            }
//        });
//
//
//
//
//        botaoSair.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//    }
//
//
//    public Cliente consultaPorCodigo(int codigo) {
//        for(Cliente a : lista){
//            if (a.getCodigo()==codigo){
//                return a;
//            }
//        }
//        return null;
//    }
//
//    public boolean cadastraMidia(Cliente jogo) {
//        if(consultaPorCodigo(jogo.getCodigo())==null){
//            lista.add(jogo);
//            return true;
//        }
//        else
//            return false;
//    }
//
//
//
//
//    public JPanel getPainel() {
//        return painel;
//    }
//}
