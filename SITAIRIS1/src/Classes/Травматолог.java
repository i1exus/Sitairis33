package Classes;
import Interfaccces.ИнформацияОвраче;
import Interfaccces.СпособЛечения;

public abstract class Травматолог implements ИнформацияОвраче, СпособЛечения {
    public static void ВыводИнформации(String a){
        System.out.println (ИнформацияОвраче.ВыводИнформации(a) + " Ломалкин Иван");
    }
}
