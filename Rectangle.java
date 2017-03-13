package geometrie;
class Rectangle extends Figure {
   private double coteHorizontal;
   private double coteVertical;
   
   Rectangle() {
        super();
        coteHorizontal = 0;
        coteVertical = 0;
   }
   
   Rectangle(double coteHorizontal, double coteVertical) {
        super();
        this.coteHorizontal = coteHorizontal;
        this.coteVertical = coteVertical;
   }
   
   Rectangle(Point centre,double coteHorizontal, double coteVertical) {
        super(centre);
        this.coteHorizontal = coteHorizontal;
        this.coteVertical = coteVertical;
   }
   
   Rectangle(Rectangle r) {
        this.setCentre(r.getCentre());
        this.coteHorizontal = r.coteHorizontal;
        this.coteVertical = r.coteVertical;
   }
   
   // encapsuleur
   
   double getCoteHorizontal() {
        return coteHorizontal;
    }
    
   void setCoteHorizontal(double coteHorizontal){
        this.coteHorizontal = coteHorizontal;
    }
   
   double getCoteVertical() {
        return coteVertical;
    }
    
   void setCoteVertical(double coteVertical){
        this.coteVertical = coteVertical;
    }
    
   public String toString(){
        return "centre : " + getCentre().toString() +"\n" + "côté vertical " + coteVertical + "\n" + "côté horizontal " + coteHorizontal ;
   }
   
   double calculerLongueur() {
        return 2 * coteVertical + 2 * coteHorizontal;
   }
   
   double calculerAire() {
        return coteVertical * coteHorizontal;
   }
   
   boolean estInscrit(Cercle c) {
        return 4 * c.getRayon() * c.getRayon() == coteHorizontal * coteHorizontal + coteVertical * coteVertical;
   }
   
   Cercle inscrire() {
        if(coteHorizontal != coteVertical)
            return null;
        return new Cercle(coteHorizontal / 2);
   }
   
   public void zoomer(double coefficient) {
        super.zoomer(coefficient);
        coteHorizontal = coefficient * coteHorizontal;
        coteVertical = coefficient * coteVertical;
   
   }
   public Losange pivoter(){
        if(estCarre())
            return new Losange(coteHorizontal);
        return null;
   }
   
   boolean estCarre(){
    return coteHorizontal == coteVertical;
   }
}
