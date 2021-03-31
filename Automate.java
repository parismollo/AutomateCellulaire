  public class Automate{
  private Cellule first;
  private Cellule last;

  // Constructor
  public Automate(Cellule c){
    this.first = c;
    this.last = c;
    System.out.println("[Constructor] - Liste created!");
  }

  public Automate(String str){
    for (int i=0; i<str.length(); i++){
      boolean b = (str.charAt(i) == '#' ? true : false);
      Cellule c = new Cellule(b);
      add(c, false);
    }
  }

  public Automate(){
    this.first = null;
    this.last = null;
  }

  // Auxiliary fonctions
  public boolean isEmpty(){
    return (this.first==null);
  }

  public void clear(){
    this.first = null;
    this.last = null;
  }

  public void add(Cellule c, boolean as_first){
    if (this.isEmpty()) {first=c; last=c; System.out.println("[add] - Cellule added at first place!");}
    else {
      if (as_first){
        this.first.setPrecedent(c);
        c.setSuivante(this.first);
        c.setPrecedent(null);
        this.first = c;
      }else{
        this.last.setSuivante(c);
        c.setPrecedent(this.last);
        c.setSuivante(null);
        this.last = c;
      }
    }
  }

  public void afficherListe(){
    if (!this.isEmpty()) {System.out.println("| "+this.first.afficherListe()+" |");}
    else System.out.println("[afficherListe] - Empty List - nothing to see here sorry!");
  }

  public void initialisation(){
    this.clear();
    int i = 0;
    boolean color;
    while (i<11){
      if (i<=2||i==6) {color=true;}
      else {color=false;}
      Cellule c = new Cellule(color);
      this.add(c, false);
      i++;
      }
  }

  public void prochaineEtape(){
    if (this.isEmpty()){return;}
    else {this.first.prochaineEtape();}
  }

  public void miseAJour(){
    if (this.isEmpty()) {return;}
    this.first.miseAJour();
  }

  public void uneEtape(){
    prochaineEtape();
    miseAJour();
  }

  public void nEtapes(int n){
    if (n>0){
      int i = 0;
      while (i<n){
        afficherListe();
        uneEtape();
        i++;
      }
    }
  }
}
