package aulas.cap02.exemplos;

import java.io.DataInputStream;
import java.io.IOException;

public class Exemplo5 {
    
    public static void main(String[] args) {
        String s;
        float largura, comprimento, area, perimentro;
        DataInputStream dado;
        try { // tratamento de erro, try é a tentativa
            System.out.println("Entre com o comprimento:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com a largura:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area =  comprimento * largura;
            perimentro =  comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo:" + area);
            System.out.println("Perimetro do retângulo:" + perimentro);

        } catch (IOException e) { 
            System.out.println("Houve um erro na entrada de dados, "+e.toString());
        } catch (NumberFormatException e) {
            System.out.println("Houve erro na conversão dos dados, Digite apenas caracteres numéricos "+e.toString());
        }
        }
    }

