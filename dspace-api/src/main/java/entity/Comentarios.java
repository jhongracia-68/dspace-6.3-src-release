/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jhon Gracia
 */
@Entity
@Table(name = "comentarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarios.findAll", query = "SELECT c FROM Comentarios c")
    , @NamedQuery(name = "Comentarios.findByComentariosId", query = "SELECT c FROM Comentarios c WHERE c.comentariosId = :comentariosId")
    , @NamedQuery(name = "Comentarios.findByNombre", query = "SELECT c FROM Comentarios c WHERE c.nombre = :nombre")})
public class Comentarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "comentarios_id")
    private Integer comentariosId;
    @Column(name = "nombre")
    private String nombre;

    public Comentarios() {
    }

    public Comentarios(Integer comentariosId) {
        this.comentariosId = comentariosId;
    }

    public Integer getComentariosId() {
        return comentariosId;
    }

    public void setComentariosId(Integer comentariosId) {
        this.comentariosId = comentariosId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comentariosId != null ? comentariosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarios)) {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.comentariosId == null && other.comentariosId != null) || (this.comentariosId != null && !this.comentariosId.equals(other.comentariosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comentarios[ comentariosId=" + comentariosId + " ]";
    }
    
}
