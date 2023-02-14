package inheritance;
public class LuasLingkaran extends BangunDatar{
    double jariJari;
    double phi;
    
    @Override
    double luas (){
        double luas = phi*jariJari*jariJari;
        System.out.println("Luas lingkaran : "+luas);
        return luas;
    }
    double keliling() {
        double keliling = 2*phi*jariJari;
        System.out.println("Keliling lingkaran : "+keliling);
        return keliling;
    }
}
