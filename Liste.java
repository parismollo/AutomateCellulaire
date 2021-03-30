public class Liste{
  private Cellule first;
  private Cellule last;

  // Constructor
  public Liste(Cellule c){
    this.first = c;
    this.last = c;
    System.out.println("[Constructor] - Liste created!");
  }

  public Liste(){
    this(null);
  }

  // Auxiliary fonctions
  public boolean isEmpty(){
    return (this.first==null);
  }

  public void clear(){
    this.first = null;
    this.last = null;
    System.out.println("[Clear] - List is now empty!");
  }

  public void add(Cellule c, boolean as_first){
    if (this.isEmpty()) {first=c; last=c; System.out.println("[add] - Cellule added at first place!");}
    else {
      if (as_first){
        c.setSuivante(this.first);
        c.setPrecedent(null);
        this.first.setPrecedent(c);
        this.first = c;
        System.out.println("[add] - Cellule added at first place!");

      }else{
        this.last.setSuivante(c);
        this.last = c;
        System.out.println("[add] - Cellule added at last place!");
      }
    }
  }

  public void afficherListe(){
    if (!this.isEmpty()) {System.out.println("| "+this.first.afficherListe()+" |");}
    else System.out.println("[afficherListe] - Empty List - nothing to see here sorry!");
  }
}
