package inheritance;
public class LuasPersegiPanjang extends BangunDatar{
    double panjang;
    double lebar;
    
    @Override
    double luas(){
        double luas = panjang*lebar;
        System.out.println("Luas persegi panjang : "+luas);
        return luas;
    }
    double keliling (){
        double keliling = 2*(panjang+lebar);
        System.out.println("Keliling persegi panjang : "+keliling);
        return keliling;
    }
}
