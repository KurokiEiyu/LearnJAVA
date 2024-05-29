package Percobaan7;

class Bapak{
    int a;
    int b;

    void show_variabel(){
        System.out.println("Nilai a="+a);
        System.out.println("Nilai b="+b);
    }
}

class Anak extends Bapak{
    int c;
    void show_variabel(){
        super.show_variabel();
        System.out.println("Nilai c="+c);
    }
}
