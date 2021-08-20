/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MN1
 */
@Entity
@Table(name = "bm_colors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmColor.findAll", query = "SELECT b FROM BmColor b")
    , @NamedQuery(name = "BmColor.findById", query = "SELECT b FROM BmColor b WHERE b.id = :id")
    , @NamedQuery(name = "BmColor.findByColorFamilyName", query = "SELECT b FROM BmColor b WHERE b.colorFamilyName = :colorFamilyName")})
public class BmColor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Short id;
    @Column(name = "color_family_name")
    private String colorFamilyName;

    public BmColor() {
    }

    public BmColor(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getColorFamilyName() {
        return colorFamilyName;
    }

    public void setColorFamilyName(String colorFamilyName) {
        this.colorFamilyName = colorFamilyName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmColor)) {
            return false;
        }
        BmColor other = (BmColor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.BmColor[ id=" + id + " ]";
    }
    
}
