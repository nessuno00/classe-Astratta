 class Triangolo extends Forma {


     private double altezza;

     private double base;

     public Triangolo(double altezza, double base) {

         this.base = base;
         this.altezza = altezza;

     }

     @Override
     double calcoloArea() {
         return  (base * altezza) / 2;
     }
 }