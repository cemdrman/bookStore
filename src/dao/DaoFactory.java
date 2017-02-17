package dao;

import java.util.List;

/**
 * Created by jan on 18.02.2017.
 */
public interface DaoFactory<T> {

    List<T> getAllRecords();
    T getAtRecord(int id);
    void insertRecord(T object);
    void updateRecord(int id, T object);
    void deleteAllRecords();
    void deleteAtRecord(int id);

}
