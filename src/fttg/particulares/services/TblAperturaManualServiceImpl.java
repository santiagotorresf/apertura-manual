/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fttg.particulares.services;

import fttg.particulares.daos.TblAperturaManualDao;
import fttg.particulares.entities.TblAperturaManual;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author storres
 */
@Service("tblAperturaManualService")
@Transactional("txManagerParticulares")
public class TblAperturaManualServiceImpl implements TblAperturaManualService {

    @Autowired
    private TblAperturaManualDao tblAperturaManualDao;
    
    @Override
    public List findByOffSincronizado(int flag) {
        return tblAperturaManualDao.findByOffSincronizado(flag);
    }

    @Override
    public void update(TblAperturaManual tblAperturaManual) {
        tblAperturaManualDao.update(tblAperturaManual);
    }

    @Override
    public void insert(TblAperturaManual tblAperturaManual) {
        tblAperturaManualDao.insert(tblAperturaManual);
    }

}
