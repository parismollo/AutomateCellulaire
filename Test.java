public class Test{
  public static void main(String[] args){
    Liste l = new Liste();
    Cellule c1 = new Cellule(true);
    Cellule c2 = new Cellule(false);

    Cellule[] cs1 = generateCellule(3);
    Cellule[] cs2 = generateCellule(3);

//  adding at first
    for (int i=0; i<cs1.length; i++){
      l.add(cs1[i], true);
    }

//  adding at last
    for (int i=0; i<cs2.length; i++){
      l.add(cs2[i], false);
    }

    l.afficherListe();
  }

  public static Cellule[] generateCellule(int quantite){
    Cellule[] cs = new Cellule[quantite];
    boolean[] bs = {true, false};
    for (int i=0; i<cs.length; i++){
      int n = (int)(Math.random() * ((1 - 0) + 1)) + 0;
      Cellule c = new Cellule(bs[n]);
      cs[i] = c;
    }
    return cs;
  }
}
