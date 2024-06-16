import javax.swing.*;

public class View extends JFrame {
    private Tela1 tela = new Tela1();;

    public View(){
        super();
        JPanel painel = tela.getPainel();
        add(painel);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
