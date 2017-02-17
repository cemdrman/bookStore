package dao.impl;

import dao.DaoFactory;
import model.Kitap;

import java.util.List;

/**
 * Created by jan on 18.02.2017.
 */
public class KitapDaoImpl implements DaoFactory<Kitap> {


    @Override
    public List<Kitap> getAllRecords() {
        return null;
    }

    @Override
    public Kitap getAtRecord(int id) {
        return null;
    }

    @Override
    public void insertRecord(Kitap object) {

    }

    @Override
    public void updateRecord(int id, Kitap object) {

    }

    @Override
    public void deleteAllRecords() {

    }

    @Override
    public void deleteAtRecord(int id) {

    }
}
