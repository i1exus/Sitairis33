package Interfaccces;

public interface СпособЛечения extends МедПомощь{
    static String Лечение(String a){
        if (a.equals("Терапевт"))
            {return "Вас вылечили с помощью таблеток и пырсколок в рот";}
                 else if (a.equals("Хирург"))
                     {return "Вас вылечили ампутацией пары пальцев, всё нормально";}
                            else
                                return "Вас вылечили, сломав лишние кости";
    }
}
