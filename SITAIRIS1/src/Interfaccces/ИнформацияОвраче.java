package Interfaccces;

public interface ИнформацияОвраче {
    static String ВыводИнформации(String a){
        if (a.equals("Терапевт"))
        {return "Вас будет лечить терапевт";}
            else if (a.equals("Хирург"))
                 {return "Вас будет лечить хирург";}
                      else if (a.equals("Травмотолог"))
                           {return "Вас будет лечить травматолог";}
                                else {return "Такого врача нет, Вас вылечит любой врач";}
    }
}
