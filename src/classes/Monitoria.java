
package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Monitoria implements Serializable {
    private ArrayList<Turma> turmas = new ArrayList();
    private Monitor monitor;

    public Monitoria(Monitor monitor) {
        this.monitor = monitor;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
}
