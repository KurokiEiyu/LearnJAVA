package Percobaan7;

public class inheritExample {
    public static void main(String[] args) {
        Bapak objectBapak=new Bapak();
        Anak objectAnak=new Anak();

        objectBapak.a=1;
        objectBapak.b=1;
        System.out.println("Object Bapak (Superclass) :");

        objectBapak.show_variabel();
        objectAnak.c=5;
        System.out.println("Object Anak (Subclass dari Bapak)");
        objectAnak.show_variabel();
    }
}