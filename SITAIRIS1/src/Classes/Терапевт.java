package Classes;
import Interfaccces.*;

public abstract class Терапевт implements ИнформацияОвраче, СпособЛечения, СпособИсцеления {
        public static void ВыводИнформации(String a){
             System.out.println (ИнформацияОвраче.ВыводИнформации(a) + " Белоусов Иван");
        }
}
