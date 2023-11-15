# Sistema_de_estatísticas_de_transito

<div align="center">
  
![image](https://github.com/thiagosilvaantenor/Sistema_de_transito/assets/99970279/8ecaf147-1984-43da-99ec-345a28850773)

![image](https://github.com/thiagosilvaantenor/Sistema_de_transito/assets/99970279/8246ddff-ce1f-4dd3-abf9-f562d9800c42)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
</div>
  
## Sobre o Projeto
Projeto em Java da disciplina "Linguagem de Programação", do curso de Análise e Desenvolvimento de Sistemas da FATEC Zona Leste.<br>
O objetivo é **criar um sistema de estatisticas de acidentes de transito**.<br> Utilizando da instancia de classe para gerar registros lógicos `(Estatística[])`,<br>para cadastrar e consultar a quantidade de acidentes em cada cidade cadastrada
<br>Além de escrever e gerar um arquivo `ArquivoEstatistica.txt` com os dados de cada cidade, utilizando o `BufferWriter e FileWriter`. Também é utilizado o `BufferReader` esse que ira ler o arquivo `ArquivoEstatistica.txt` para executar as consultas. 

## Índice
=================
<!--ts-->
* [Título](#sistema_de_estatísticas_de_transito)
* [Sobre o Projeto](#sobre_o_projeto)
* [Índice](#índice)
* [Classes](#classes)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Classes
 <div align = "center">
<hr>
   <h3> Objeto: ESTATÍSTICA </h3>
<hr>
   Atributos:
   
* int : CodigoCidade
* String : NomeCidade
* int : QtdAcidentes 
   
<hr>
<h3>MENU ESTATÍSTICA</h3>
<hr>
<!--ts-->
| Estatísticas de acidentes em 2020
|<br>| 1 - Cadastro Estatística
|<br>| 2 - Consulta por quantidade de acidentes
|<br>| 3 - Consulta por estatísticas de acidentes
|<br>| 4 - Acidentes acima da média das 10 cidades
|<br>| 9 - Finaliza |
<!--te-->

<hr> 
<h3>Classe dos Metodos</h3>
<hr>

- Cadastrar 10 registros a partir do metodo:<br>
  (função) [ FCadastraEstatistica(Estatistica[] es)](https://github.com/thiagosilvaantenor/Sistema_de_transito/blob/main/src/ClasseMetodos.java)

- Consulta por quantidade de acidentes > 100 e < 500:<br>
  (procedimento) [PQtdAcidentes(Estatistica[] es)](https://github.com/thiagosilvaantenor/Sistema_de_transito/blob/main/src/ClasseMetodos.java)
  
- Consultar por:  maior e menor número de acidentes:<br>
  (procedimento) [PMaiorMenor(Estatistica[] es)](https://github.com/thiagosilvaantenor/Sistema_de_transito/blob/main/src/ClasseMetodos.java)
  
- Cidades com qtd de acidentes acima da média das 10 cidades:<br> 
  (procedimento) [PAcima(Estatistica[] es)](https://github.com/thiagosilvaantenor/Sistema_de_transito/blob/main/src/ClasseMetodos.java)
<hr>
  
</div>

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)
  - [BufferedWriter](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html)
  - [BufferedReader](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
  - [Java.IO](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html)

## Agradecimentos
Agradeço ao professor da disciplina de Linguagem de Programação, Ricardo Satoshi, por todo o aprendizado passado.

## Autor
<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br/>
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)

</div>
