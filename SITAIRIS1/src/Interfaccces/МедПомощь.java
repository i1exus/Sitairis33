package Interfaccces;

public interface МедПомощь {
    default int Помощь(int a, int b){
        return a*b;
    }
}
