/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fttg.particulares.services;

import fttg.particulares.entities.TblAperturaManual;
import java.util.List;

/**
 *
 * @author storres
 */
public interface TblAperturaManualService {

    List findByOffSincronizado(int flag);

    void update(TblAperturaManual tblAperturaManual);

    void insert(TblAperturaManual tblAperturaManual);

}
