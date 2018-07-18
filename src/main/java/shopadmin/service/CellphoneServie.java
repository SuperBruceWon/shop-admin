package shopadmin.service;

import java.util.List;

import shopadmin.model.Cellphone;

public interface CellphoneServie {

    void create(Cellphone cellphone);

    List<Cellphone> findAll();
}
