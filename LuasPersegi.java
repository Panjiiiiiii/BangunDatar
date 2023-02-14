package inheritance;
public class LuasPersegi extends BangunDatar{
    double sisi;
    
    @Override
    double luas (){
        double luas = sisi*sisi;
        System.out.println("Luas persegi : "+luas);
        return luas;
    }
    
    double keliling () {
        double keliling = 4*sisi;
        System.out.println("Keliling persegi : "+keliling);
        return keliling;
    }
}
