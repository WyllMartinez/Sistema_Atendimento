
package br.com.controlaratendimento.classes;

import br.com.controlaratendimento.models.Atendimento;
import javax.swing.JOptionPane;

public class FilaAtendimento {

    private Atendimento[] dados;
    private int frente;
    private int fim;
    private int numItens;

    public FilaAtendimento(int maximo) {
        dados = new Atendimento[maximo];
        frente = 0;
        fim = -1;
        numItens = 0;
    }

    public void enqueue(Atendimento numero) {
        if (fim == dados.length - 1) {
            fim = -1;
        }
        dados[++fim] = numero;
        numItens++;
    }

    public String dequeue() {
        Atendimento temp = dados[frente++];
        if (frente == dados.length) {
            frente = 0;
        }
        numItens--;
        return temp.toString();
    }
    
    public boolean isEmpty(){
        return numItens ==0;
    }
    
    public boolean isFull(){
        return numItens == dados.length;
    }
    
     public void mostrar(){
        String elementos = "";
            for (int i = frente; i<=fim; i++) {
                elementos += dados[i]+ "\n---------\n";
            }
            JOptionPane.showMessageDialog(null, elementos);
    }
    

}

