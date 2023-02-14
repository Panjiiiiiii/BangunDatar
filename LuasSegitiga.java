package inheritance;
public class LuasSegitiga extends BangunDatar {
    double alas;
    double tinggi;
    @Override
    
    double luas (){
        double luas = 0.5*alas*tinggi;
        System.out.println("Luas segitiga : "+luas);
        return luas;
    }
}
