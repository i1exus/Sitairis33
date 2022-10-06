package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

import Classes.*;
import Interfaccces.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Я люблю нашего старосту");
        НародныйЦелитель a = new НародныйЦелитель();
        Шаман b = new Шаман("абдурахман");

        for (int i=0; i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nВас могут вылечить две организации, отвечающие за ТРАДИЦИОННУЮ и НАРОДНУЮ медицину.");
            System.out.println("Выберите требуемую медицину, введя 'Традиционная' или 'Народная'.");
        String ВыборМедицины = sc.nextLine();
             if (ВыборМедицины.equals("Традиционная"))
             {
                 System.out.println("Выберите врача, введя 'Терапевт', 'Травматолог', 'Хирург'.");
                 String ВыборВрача = sc.nextLine();

                 if (ВыборВрача.equals("Терапевт"))
                 {Терапевт.ВыводИнформации(ВыборВрача);}
                 else if (ВыборВрача.equals("Хирург"))
                 {Хирург.ВыводИнформации(ВыборВрача);}
                 else if (ВыборВрача.equals("Травматолог"))
                 {Травматолог.ВыводИнформации(ВыборВрача);}

                 System.out.println(СпособЛечения.Лечение(ВыборВрача));
             }
            else if(ВыборМедицины.equals("Народная")) {
                 System.out.println("1-Шаман, 2-Целитель\n Ваш выбор:");
                 int Выбор = sc.nextInt();
                 System.out.println("Сколько на ладошку покладёте? (в $)");
                 int Деньги = sc.nextInt();

                 Целитель.Исцелить();
                 System.out.println(СпособИсцеления.Исцеление(Выбор, ШансЛечения.ШансНаЛечение(Выбор, Деньги)));
                 if (Выбор == 1) {
                     System.out.println(b.Метод());
                 } else if (Выбор == 2) {
                     System.out.println(a.Метод());
                 }
             }
            else System.out.println("Такого выбора нет");
             }}
             }


