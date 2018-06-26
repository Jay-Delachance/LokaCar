package com.example.jocelynjoubert2017.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.jocelynjoubert2017.lokacar.dal.GeneriqueDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Agence;

import java.util.List;

@Dao
public interface AgenceDAO extends GeneriqueDAO<Agence> {

    // select all
    @Query("SELECT * FROM agences")
    public List<Agence> getAll();

    // select by id
    @Query("SELECT * FROM agences WHERE id = :id")
    public Agence selectById(int id);

}
