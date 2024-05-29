package Percobaan2;

public class Pegawai {
    private String nama;
    public double gaji;
}

public class Manajer extends Pegawai{
    public String departemen;
    
    public void IsiData(String n, String d){
        nama=n;
        departemen=d;
    }
}
