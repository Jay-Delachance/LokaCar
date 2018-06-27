package com.example.jocelynjoubert2017.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.jocelynjoubert2017.lokacar.dal.GeneriqueDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Client;

import java.util.List;

@Dao
public interface ClientDAO extends GeneriqueDAO<Client> {

    // select all
    @Query("SELECT * FROM clients")
    public List<Client> getAll();

    // select par id
    @Query("SELECT * FROM clients where id = :id")
    public Client selectById(String id);

    // select par nom
    @Query("SELECT * FROM clients where nom LIKE :nom")
    public List<Client> selectByName(String nom);

    @Query("DELETE FROM clients")
    public void nukeTable();
}
