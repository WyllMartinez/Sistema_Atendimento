package br.com.controlaratendimento.classes;

import br.com.controlaratendimento.models.Paciente;
import java.util.Comparator;

public class Comparador implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return +1;
        } else {
            return 0;
        }
    }
}
