public class CalcoloArea {

    public  static void main (String [] args) {

        Rettangolo rettangolo = new Rettangolo(23,9);
        Triangolo triangolo = new Triangolo(32,8);

        System.out.println("L'area del rettangolo è : " + rettangolo.calcoloArea());
        System.out.println("L'area del triangolo è : " + triangolo.calcoloArea());
    }
}
