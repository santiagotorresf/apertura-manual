/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fttg.particulares.services;

import fttg.particulares.daos.TblAperturaManualCabinaDDao;
import fttg.particulares.entities.TblAperturaManual;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author storres
 */
@Service("tblAperturaManualCabinaDService")
@Transactional("txManagerCabinaD")
public class TblAperturaManualCabinaDServiceImpl implements TblAperturaManualCabinaDService {

    @Autowired
    private TblAperturaManualCabinaDDao tblAperturaManualCabinaDDao;
    
    @Override
    public List findByOffSincronizado(boolean flag) {
        return tblAperturaManualCabinaDDao.findByOffSincronizado(flag);
    }

    @Override
    public void update(TblAperturaManual tblAperturaManual) {
        tblAperturaManualCabinaDDao.update(tblAperturaManual);
    }

}
