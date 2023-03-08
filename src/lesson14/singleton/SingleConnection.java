package lesson14.singleton;

import java.sql.Connection;

//цель паттерна синлгтон получение одного объекта класса
public class SingleConnection {
    private static SingleConnection obj;
    Connection connection;
    private SingleConnection(){
        connection = null;//подключение к базе данных
    }
    public static SingleConnection getObj(){
        if (obj == null){
            obj = new SingleConnection();
        }
        return obj;
    }
    void select(){}
    void update(){}
    void insert(){}
    void delete(){}

}
