package shopadmin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.CellphoneMapper;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneServie;

@Service
public class CellphoneServiceImpl implements CellphoneServie {
    private CellphoneMapper cellphoneMapper;

    @Autowired
    public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
        this.cellphoneMapper = cellphoneMapper;
    }

    @Override
    public void create(Cellphone cellphone) {
        cellphoneMapper.create(cellphone);
    }
}
