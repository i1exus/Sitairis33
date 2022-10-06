package Interfaccces;

public interface СпособИсцеления extends МедПомощь {
    static String Исцеление(int a, int b){

        if (a==1)
        {return "Шаман с шансом на лечение " + b;}
        else {return " Народный целитель с шансом на лечение " + b;}
        }


}
