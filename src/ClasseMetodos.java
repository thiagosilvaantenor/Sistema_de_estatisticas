import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseMetodos {

  // Cadastra 10 registros de Estatisticas
  Estatistica[] FCadastraEstatistica(Estatistica[] es) throws IOException{
    int i;
    String fileName = "ArquivoEstatistica.txt";
    BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName));

    for (i = 0; i <= 9; i++) {
      es[i].NomeCidade = JOptionPane.showInputDialog("Olá, informe o nome da cidade n° " + (i + 1));
      gravar.write(es[i].NomeCidade);
      gravar.newLine();
      es[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe o codigo da cidade n° " + (i + 1)));
      gravar.write(Integer.toString(es[i].CodigoCidade));
      gravar.newLine();
      es[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Por fim, informe a quantidade de acidentes da cidade n° " + (i + 1)));
      gravar.write(Integer.toString(es[i].QtdAcidentes));
      gravar.newLine();
    }
    gravar.close();
    System.out.println("Gravação feita!");
    return es;
  }

  // Consulta por quantidade de acidentes > 100 e < 500
  void PQtdAcidentes(Estatistica[] es) throws IOException{
    int i;
    String fileName = "ArquivoEstatistica.txt";
    BufferedReader ler = new BufferedReader(new FileReader(fileName));
    
    for (i = 0; i <= 9; i++) {
      if (es[i].QtdAcidentes > 100 && es[i].QtdAcidentes < 500) {
        es[i].NomeCidade = ler.readLine();
        es[i].CodigoCidade = Integer.parseInt(ler.readLine());
        es[i].QtdAcidentes = Integer.parseInt(ler.readLine());
      }
    for(i = 0; i < es.length; i++){
      JOptionPane.showMessageDialog(null, es[i].NomeCidade);
      JOptionPane.showMessageDialog(null, es[i].CodigoCidade);
      JOptionPane.showMessageDialog(null, es[i].QtdAcidentes);
    }
  }
    ler.close();
  }

  // Consultar por: menor número de acidentes; maior número de acidentes;
  // (procedimento)
  void PMaiorMenor(Estatistica[] es) throws IOException {
    int i;
    String fileName = "ArquivoEstatistica.txt";
    BufferedReader ler = new BufferedReader(new FileReader(fileName));
    int maior, menor, posMaior = 0, posMenor = 0;
    
    
    maior = es[0].QtdAcidentes;
    menor = es[0].QtdAcidentes;


    // Verifica quais são os registros maior e menor
    for (i = 0; i <= 9; i++) {
      if (es[i].QtdAcidentes < menor) {
        menor = es[i].QtdAcidentes;
        posMenor = i;
      } else if (es[i].QtdAcidentes > maior) {
        maior = es[i].QtdAcidentes;
        posMaior = i;
      }
    }

    for(i = 0; i < es.length;i++){
      es[i].NomeCidade = ler.readLine();
      es[i].CodigoCidade = Integer.parseInt(ler.readLine());
      es[i].QtdAcidentes = Integer.parseInt(ler.readLine());
    }

    // Mostra o resultado
    JOptionPane.showMessageDialog(null,
        "A cidade com maior quantidade de acidentes é a cidade: " + es[posMaior].NomeCidade + "\nCodigo: "
            + es[posMaior].CodigoCidade + "\nCom, " + es[posMaior].QtdAcidentes + ", número de acidentes.");

    JOptionPane.showMessageDialog(null,
        "Já a cidade com menor quantidade de acidentes é a cidade:  " + es[posMenor].NomeCidade + "\nCodigo: "
            + es[posMenor].CodigoCidade + "\nCom, " + es[posMenor].QtdAcidentes + ", número de acidentes.");
        ler.close();
  }

  // Cidades com qtd de acidentes acima da média das 10 cidades -PACIMA
  // (procedimento)
  void PAcima(Estatistica[] es) throws IOException {
    // media qtd de acidentes
    int i, media = 0;
    String fileName = "ArquivoEstatistica.txt";
    BufferedReader ler = new BufferedReader(new FileReader(fileName));

    for(i = 0; i < es.length; i++){
      es[i].QtdAcidentes = Integer.parseInt(ler.readLine());
    }

    for (i = 0; i < es.length; i++) {
      media += es[i].QtdAcidentes;
    }
    media = media / i;

    for(i = 0; i < es.length; i++){
      es[i].NomeCidade = ler.readLine();
      es[i].CodigoCidade = Integer.parseInt(ler.readLine());
      es[i].QtdAcidentes = Integer.parseInt(ler.readLine());
    }
    // Mostra as cidades que ficaram acima da media

    for (i = 0; i < es.length; i++) {
      JOptionPane.showMessageDialog(null,
          "A média de acidentes foi: " + media + "\nAscidades que ficaram acima da média foram: ");
      if (es[i].QtdAcidentes > media) {
        JOptionPane.showMessageDialog(null, "A cidade: " + es[i].NomeCidade + "\nCodigo: " + es[i].CodigoCidade
            + "\nQtd acidentes: " + es[i].QtdAcidentes);
      }
    }
    ler.close();
  }

}
