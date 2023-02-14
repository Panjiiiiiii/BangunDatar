package inheritance;
public class main {
    public static void main(String[] args) {
        BangunDatar LuasKeliling = new BangunDatar();
        
        LuasLingkaran lingkaran = new LuasLingkaran();
        lingkaran.jariJari = 14.0;
        lingkaran.phi = 3.14;
        
        LuasPersegi persegi = new LuasPersegi();
        persegi.sisi = 5.0;
        
        LuasPersegiPanjang persegiPanjang = new LuasPersegiPanjang();
        persegiPanjang.lebar = 5.0;
        persegiPanjang.panjang = 10.0;
        
        LuasSegitiga SegiTiga = new LuasSegitiga();
        SegiTiga.alas = 24.0;
        SegiTiga.tinggi = 12.0;
        
        LuasKeliling.luas();
        LuasKeliling.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        SegiTiga.luas();
    }
}
