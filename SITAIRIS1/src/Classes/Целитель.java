package Classes;

import Interfaccces.СпособИсцеления;

public abstract class Целитель implements СпособИсцеления {
    public Целитель (){}
    public static void Исцелить(){

        System.out.println ("Вас будут исцелять народной медициной. Вас будет лечить");
    }
}
