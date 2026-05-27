package fr.univ_amu.iut.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Historique {

  private static final int TAILLE_MAX_HISTORIQUE = 10;
  private final List<String> historique = new ArrayList<>();

  public List<String> asList() {
    return historique;
  }

  public String afficher() {
    StringBuilder sb = new StringBuilder();
    sb.append("--- Historique ---\n");
    for (String h : historique) {
      sb.append("- ").append(h).append("\n");
    }
    return sb.toString();
  }

  public void add(String titre) {
    if (titre != null) {
      historique.add(titre);
    }
  }

  public int size() {
    return historique.size();
  }

  public void remove(int i) {
    if (i >= 0 && i < historique.size()) {
      historique.remove(i);
    }
  }

  void enregistrer(String titre) {
    add(titre);
    if (size() > Menu.TAILLE_MAX_HISTORIQUE) {
      remove(0);
    }
  }
}
