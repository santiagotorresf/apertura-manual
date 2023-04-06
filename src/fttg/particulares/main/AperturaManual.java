/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fttg.particulares.main;

import fttg.particulares.services.TblAperturaManualCabinaAService;
import fttg.particulares.services.TblAperturaManualCabinaBService;
import fttg.particulares.services.TblAperturaManualCabinaCService;
import fttg.particulares.services.TblAperturaManualCabinaDService;
import fttg.particulares.entities.TblAperturaManual;
import fttg.particulares.services.TblAperturaManualService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author storres
 */
public class AperturaManual {

    private static final Logger LOGGER = Logger.getLogger(AperturaManual.class);
    private static ApplicationContext context;

    public static void main(String args[]) throws UnknownHostException {
        LOGGER.info("******************** Iinicio del Programa: " + LocalDateTime.now() + " ******************** : ");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CabinaA();
        CabinaB();
        CabinaC();
        CabinaD();
        LOGGER.info("******************** Fin del Programa: " + LocalDateTime.now() + " ******************** : ");
    }

    public static void CabinaA() {
        final String ipCabinaA = "10.10.2.159";
        try {
            InetAddress ip = InetAddress.getByName(ipCabinaA);
            boolean conectar = ip.isReachable(5000);
            if (conectar) {
                TblAperturaManualCabinaAService cabinaAService = (TblAperturaManualCabinaAService) context.getBean("tblAperturaManualCabinaAService");
                TblAperturaManualService particularesService = (TblAperturaManualService) context.getBean("tblAperturaManualService");
                List<TblAperturaManual> aperturasCabinaA = cabinaAService.findByOffSincronizado(false);
                for (TblAperturaManual t : aperturasCabinaA) {
                    TblAperturaManual tblAperturaManual = new TblAperturaManual(t.getFechaApertura(), t.getObservacion(), t.getSesion(), t.getManual(), t.getAutorizacion(), t.getIdUser(), t.getFechaRegistro(), t.getIdCaja(), Boolean.TRUE, new Date());
                    particularesService.insert(tblAperturaManual);
                    t.setOffSincronizado(Boolean.TRUE);
                    t.setOffFechaSincronizado(new Date());
                    cabinaAService.update(t);
                }
            } else {
                LOGGER.error("No hay comunicación con la ip " + ipCabinaA);
            }
        } catch (IOException e) {
            LOGGER.error("No hay comunicación con la Ip: " + ipCabinaA + " " + e.getMessage());
        }
    }

    public static void CabinaB() {
        final String ipCabinaB = "10.10.2.156";
        try {
            InetAddress ip = InetAddress.getByName(ipCabinaB);
            boolean conectar = ip.isReachable(5000);
            if (conectar) {
                TblAperturaManualCabinaBService cabinaBService = (TblAperturaManualCabinaBService) context.getBean("tblAperturaManualCabinaBService");
                TblAperturaManualService particularesService = (TblAperturaManualService) context.getBean("tblAperturaManualService");
                List<TblAperturaManual> aperturasCabinaB = cabinaBService.findByOffSincronizado(false);
                for (TblAperturaManual t : aperturasCabinaB) {
                    TblAperturaManual tblAperturaManual = new TblAperturaManual(t.getFechaApertura(), t.getObservacion(), t.getSesion(), t.getManual(), t.getAutorizacion(), t.getIdUser(), t.getFechaRegistro(), t.getIdCaja(), Boolean.TRUE, new Date());
                    particularesService.insert(tblAperturaManual);
                    t.setOffSincronizado(Boolean.TRUE);
                    t.setOffFechaSincronizado(new Date());
                    cabinaBService.update(t);
                }
            } else {
                LOGGER.error("No hay comunicación con la ip " + ipCabinaB);
            }
        } catch (IOException e) {
            LOGGER.error("No hay comunicación con la Ip: " + ipCabinaB + " " + e.getMessage());
        }
    }

    public static void CabinaC() {
        final String ipCabinaC = "10.10.2.158";
        try {
            InetAddress ip = InetAddress.getByName(ipCabinaC);
            boolean conectar = ip.isReachable(5000);
            if (conectar) {
                TblAperturaManualCabinaCService cabinaCService = (TblAperturaManualCabinaCService) context.getBean("tblAperturaManualCabinaCService");
                TblAperturaManualService particularesService = (TblAperturaManualService) context.getBean("tblAperturaManualService");
                List<TblAperturaManual> aperturasCabinaC = cabinaCService.findByOffSincronizado(false);
                for (TblAperturaManual t : aperturasCabinaC) {
                    TblAperturaManual tblAperturaManual = new TblAperturaManual(t.getFechaApertura(), t.getObservacion(), t.getSesion(), t.getManual(), t.getAutorizacion(), t.getIdUser(), t.getFechaRegistro(), t.getIdCaja(), Boolean.TRUE, new Date());
                    particularesService.insert(tblAperturaManual);
                    t.setOffSincronizado(Boolean.TRUE);
                    t.setOffFechaSincronizado(new Date());
                    cabinaCService.update(t);
                }
            } else {
                LOGGER.error("No hay comunicación con la ip " + ipCabinaC);
            }
        } catch (IOException e) {
            LOGGER.error("No hay comunicación con la Ip: " + ipCabinaC + " " + e.getMessage());
        }
    }

    public static void CabinaD() {
        final String ipCabinaD = "10.10.2.157";
        try {
            InetAddress ip = InetAddress.getByName(ipCabinaD);
            boolean conectar = ip.isReachable(5000);
            if (conectar) {
                TblAperturaManualCabinaDService cabinaDService = (TblAperturaManualCabinaDService) context.getBean("tblAperturaManualCabinaDService");
                TblAperturaManualService particularesService = (TblAperturaManualService) context.getBean("tblAperturaManualService");
                List<TblAperturaManual> aperturasCabinaD = cabinaDService.findByOffSincronizado(false);

                for (TblAperturaManual t : aperturasCabinaD) {
                    TblAperturaManual tblAperturaManual = new TblAperturaManual(t.getFechaApertura(), t.getObservacion(), t.getSesion(), t.getManual(), t.getAutorizacion(), t.getIdUser(), t.getFechaRegistro(), t.getIdCaja(), Boolean.TRUE, new Date());
                    particularesService.insert(tblAperturaManual);
                    t.setOffSincronizado(Boolean.TRUE);
                    t.setOffFechaSincronizado(new Date());
                    cabinaDService.update(t);
                }
            }
        } catch (IOException e) {
            LOGGER.error("No hay comunicación con la Ip: " + ipCabinaD + " " + e.getMessage());
        }
    }
}
