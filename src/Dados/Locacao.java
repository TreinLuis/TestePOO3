package Dados;
import java.util.ArrayList;
import java.util.List;

public class Locacao {
    private List<Robo> listaRobos = new ArrayList<>();


    public Locacao() {
        this.listaRobos = listaRobos;
    }

    public boolean adicionarRobo(Robo novoRobo) {
        if (consultaId(novoRobo.getId()) != null) {
            return false;
        }
        return listaRobos.add(novoRobo);
    }

    public Robo consultaId(int id) {
        Robo robo = listaRobos.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
        if (    robo != null) {
            return robo;
        } else {
            return null;
        }
    }

}
