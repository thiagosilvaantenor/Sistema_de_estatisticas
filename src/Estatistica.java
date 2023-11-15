class Estatistica {
  int CodigoCidade;
  int QtdAcidentes;
  String NomeCidade;

  Estatistica(){
    this(0, 0, "");
  }

  Estatistica(int cod, int acidentes, String cidade) {
    this.CodigoCidade = cod;
    this.QtdAcidentes = acidentes;
    this.NomeCidade = cidade;
  }
}
