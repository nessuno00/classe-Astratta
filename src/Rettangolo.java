 class Rettangolo extends Forma {


     private double altezza;
     private double base;

     public Rettangolo(double altezza, double base) {

         this.base = base;
         this.altezza = altezza;

     }

     @Override
     double calcoloArea() {
         return  base * altezza ;
     }
 }
