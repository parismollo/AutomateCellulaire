public class Cellule{
  private Cellule precedent;
  private Cellule suivante;
  private boolean noire;

// Constructor
  public Cellule(boolean noire){
    this.noire = noire;
    this.precedent = null;
    this.suivante = null;
    System.out.println("[Constructor] - Cellule created!");
  }

// Getters
  public Cellule getPrecedent(){
    return this.precedent;
  }
  public Cellule getSuivante(){
    return this.suivante;
  }
  public boolean getNoire(){
    return this.noire;
  }
// Setters
  public void setPrecedent(Cellule c){
    this.precedent = c;
    System.out.println("[Setter] - Precedent updated!");
  }
  public void setSuivante(Cellule c){
    this.suivante = c;
    System.out.println("[Setter] - Suivante updated!");
  }
  public void setNoire(boolean b){
    this.noire = b;
    System.out.println("[setNoire] - Noire updated!");
  }

  // Auxiliary functions
  public String afficher(){
    return (this.noire) ? "#" : "-";
  }

  public String afficherListe(){
    if (this.suivante == null){
      return this.afficher();
    }
    return this.afficher() + this.suivante.afficherListe();
  }
}
