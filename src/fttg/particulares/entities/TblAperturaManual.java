/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fttg.particulares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "TBL_APERTURA_MANUAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAperturaManual.findAll", query = "SELECT t FROM TblAperturaManual t")
    , @NamedQuery(name = "TblAperturaManual.findByIdApertura", query = "SELECT t FROM TblAperturaManual t WHERE t.idApertura = :idApertura")
    , @NamedQuery(name = "TblAperturaManual.findByFechaApertura", query = "SELECT t FROM TblAperturaManual t WHERE t.fechaApertura = :fechaApertura")
    , @NamedQuery(name = "TblAperturaManual.findByObservacion", query = "SELECT t FROM TblAperturaManual t WHERE t.observacion = :observacion")
    , @NamedQuery(name = "TblAperturaManual.findBySesion", query = "SELECT t FROM TblAperturaManual t WHERE t.sesion = :sesion")
    , @NamedQuery(name = "TblAperturaManual.findByManual", query = "SELECT t FROM TblAperturaManual t WHERE t.manual = :manual")
    , @NamedQuery(name = "TblAperturaManual.findByAutorizacion", query = "SELECT t FROM TblAperturaManual t WHERE t.autorizacion = :autorizacion")
    , @NamedQuery(name = "TblAperturaManual.findByIdUser", query = "SELECT t FROM TblAperturaManual t WHERE t.idUser = :idUser")
    , @NamedQuery(name = "TblAperturaManual.findByFechaRegistro", query = "SELECT t FROM TblAperturaManual t WHERE t.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "TblAperturaManual.findByIdCaja", query = "SELECT t FROM TblAperturaManual t WHERE t.idCaja = :idCaja")
    , @NamedQuery(name = "TblAperturaManual.findByOffSincronizado", query = "SELECT t FROM TblAperturaManual t WHERE t.offSincronizado = :offSincronizado")
    , @NamedQuery(name = "TblAperturaManual.findByOffFechaSincronizado", query = "SELECT t FROM TblAperturaManual t WHERE t.offFechaSincronizado = :offFechaSincronizado")})
public class TblAperturaManual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_APERTURA")
    private Integer idApertura;
    @Basic(optional = false)
    @Column(name = "FECHA_APERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;
    @Basic(optional = false)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Basic(optional = false)
    @Column(name = "SESION")
    private int sesion;
    @Basic(optional = false)
    @Column(name = "MANUAL")
    private boolean manual;
    @Column(name = "AUTORIZACION")
    private String autorizacion;
    @Column(name = "ID_USER")
    private String idUser;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "ID_CAJA")
    private Integer idCaja;
    @Column(name = "OFF_SINCRONIZADO")
    private Boolean offSincronizado;
    @Column(name = "OFF_FECHA_SINCRONIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offFechaSincronizado;

    public TblAperturaManual() {
    }

    public TblAperturaManual(Integer idApertura) {
        this.idApertura = idApertura;
    }

    public TblAperturaManual(Integer idApertura, Date fechaApertura, String observacion, int sesion, boolean manual) {
        this.idApertura = idApertura;
        this.fechaApertura = fechaApertura;
        this.observacion = observacion;
        this.sesion = sesion;
        this.manual = manual;
    }

    public TblAperturaManual(Date fechaApertura, String observacion, int sesion, boolean manual, String autorizacion, String idUser, Date fechaRegistro, Integer idCaja, Boolean offSincronizado, Date offFechaSincronizado) {
        this.fechaApertura = fechaApertura;
        this.observacion = observacion;
        this.sesion = sesion;
        this.manual = manual;
        this.autorizacion = autorizacion;
        this.idUser = idUser;
        this.fechaRegistro = fechaRegistro;
        this.idCaja = idCaja;
        this.offSincronizado = offSincronizado;
        this.offFechaSincronizado = offFechaSincronizado;
    }

    public Integer getIdApertura() {
        return idApertura;
    }

    public void setIdApertura(Integer idApertura) {
        this.idApertura = idApertura;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }

    public boolean getManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Boolean getOffSincronizado() {
        return offSincronizado;
    }

    public void setOffSincronizado(Boolean offSincronizado) {
        this.offSincronizado = offSincronizado;
    }

    public Date getOffFechaSincronizado() {
        return offFechaSincronizado;
    }

    public void setOffFechaSincronizado(Date offFechaSincronizado) {
        this.offFechaSincronizado = offFechaSincronizado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApertura != null ? idApertura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAperturaManual)) {
            return false;
        }
        TblAperturaManual other = (TblAperturaManual) object;
        if ((this.idApertura == null && other.idApertura != null) || (this.idApertura != null && !this.idApertura.equals(other.idApertura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TblAperturaManual{" + "fechaApertura=" + fechaApertura + ", observacion=" + observacion + ", sesion=" + sesion + ", manual=" + manual + ", autorizacion=" + autorizacion + ", idUser=" + idUser + ", fechaRegistro=" + fechaRegistro + ", idCaja=" + idCaja + ", offSincronizado=" + offSincronizado + ", offFechaSincronizado=" + offFechaSincronizado + '}';
    }

    
    
}
