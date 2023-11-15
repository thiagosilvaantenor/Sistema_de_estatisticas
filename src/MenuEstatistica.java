import java.io.IOException;

import javax.swing.JOptionPane;

public class MenuEstatistica {
  public static void main(String args[]) throws IOException{
    ClasseMetodos m = new ClasseMetodos();
    int op = 0;
    Estatistica[] estatistica = new Estatistica[10];

    for(int i = 0; i < estatistica.length; i++){
      estatistica[i] = new Estatistica();
    }

    JOptionPane.showMessageDialog(null,"Menu Estatística");
    while(op != 9){
      op = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de acidentes em 2020\n1 - Cadastro Estatística\n2 - Consulta por quantidade de acidentes\n3 - Consulta por estatística de acidentes\n4 - Acidentes acima da média das 10 cidades\n9 - Finalizar"));
        switch(op){
          case 1: m.FCadastraEstatistica(estatistica);
          break;
          case 2: m.PQtdAcidentes(estatistica);
          break;
          case 3: m.PMaiorMenor(estatistica);
          break;
          case 4: m.PAcima(estatistica);
          break;
          case 9: JOptionPane.showMessageDialog(null, "Finalizando ...");
          break;
          default: JOptionPane.showMessageDialog(null,"Erro! Opção invalida, tente novamente!");
        }

    }
    }
  }

