/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fttg.particulares.daos;

import fttg.particulares.entities.TblAperturaManual;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author storres
 */
@Repository
public class TblAperturaManualDaoImpl extends HibernateDaoSupport implements TblAperturaManualDao {

    private static final Logger LOGGER = Logger.getLogger(TblAperturaManualDaoImpl.class);

    @Autowired
    public TblAperturaManualDaoImpl(SessionFactory factoryParticulares) {
        super.setSessionFactory(factoryParticulares);
    }

    @Override
    public List findByOffSincronizado(int flag) {
        LOGGER.info("Método findByOffSincronizado");
        List aperturas;
        try {
            aperturas = this.getHibernateTemplate().getSessionFactory().getCurrentSession()
                    .getNamedQuery("TblAperturaManual.findByOffSincronizado")
                    .setParameter("offSincronizado", flag)
                    .list();

        } catch (Exception e) {
            LOGGER.error("Error Método findByOffSincronizado " + e);
            aperturas = null;
        }
        return aperturas;
    }

    @Override
    @Transactional
    public void update(TblAperturaManual tblAperturaManual) {
        try {
            this.getHibernateTemplate().getSessionFactory().getCurrentSession().update(tblAperturaManual);
        } catch (Exception e) {
            LOGGER.error("Error Método update " + e);
        }
    }

    @Override
    @Transactional
    public void insert(TblAperturaManual tblAperturaManual) {
        try {
            this.getHibernateTemplate().getSessionFactory().getCurrentSession().save(tblAperturaManual);
        } catch (Exception e) {
            LOGGER.error("Error Método insert " + e);
        }
    }

}
