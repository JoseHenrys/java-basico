package aulas.cap03.exemplos;

import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        int a = 10, b = 15, maior;
        String aux = JOptionPane.showInputDialog("Forneça o primeiro número");
        a = Integer.parseInt(aux); 

        aux = JOptionPane.showInputDialog("Forneça o segundo número");
        b = Integer.parseInt(aux);

        if (a > b){
            maior = a;
        } else {
            maior = b;
        }
        JOptionPane.showMessageDialog(null, "Usando um if comum:"+ maior);

        int c = 10, d = 8;
        maior = (c > d) ? c : d;
        JOptionPane.showMessageDialog(null, "Usando um if resumido"+ maior);
    }
    
}
