public class Cellule{
  private Cellule precedent;
  private Cellule suivante;
  private boolean noire;
  private boolean prochainEtat;

// Constructor
  public Cellule(boolean noire){
    this.noire = noire;
    this.precedent = null;
    this.suivante = null;
    this.prochainEtat = false;
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
  public boolean getProchaineEtat(){
    return this.prochainEtat;
  }
// Setters
  public void setPrecedent(Cellule c){
    this.precedent = c;
  }
  public void setSuivante(Cellule c){
    this.suivante = c;
  }
  public void setNoire(boolean b){
    this.noire = b;
  }
  public void setProchaineEtat(boolean b){
    this.prochainEtat = b;
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

  public void prochaineEtape(){
    Cellule c = this;
    boolean b;
    while(c!=null){
      if (c==this){
        if(c.noire==false && c.suivante.noire==false){b=false;}
        else {b=true;}
        c.prochainEtat = b;
        c = c.suivante;
        continue;
      }

      if (c.suivante==null){
        if (c.noire==false && c.precedent.noire==false){b=false;}
        else {b=true;}
        c.prochainEtat = b;
        break;
      }

      if (c.precedent.noire == c.noire && c.noire == c.suivante.noire){
        b = false;
      }else{
        b = true;
      }
      c.prochainEtat = b;
      c = c.suivante;
    }
  }

  public void miseAJour(){
    Cellule c = this;
    while (c!=null){
      c.noire = c.prochainEtat;
      c = c.suivante;
    }
  }
}
