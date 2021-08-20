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
import javax.persistence.JoinColumn;
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
@Table(name = "lb_colors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LbColor.findAll", query = "SELECT l FROM LbColor l")
    , @NamedQuery(name = "LbColor.findById", query = "SELECT l FROM LbColor l WHERE l.id = :id")
    , @NamedQuery(name = "LbColor.findByColorCode", query = "SELECT l FROM LbColor l WHERE l.colorCode = :colorCode")
    , @NamedQuery(name = "LbColor.findByColorLabel", query = "SELECT l FROM LbColor l WHERE l.colorLabel = :colorLabel")
    , @NamedQuery(name = "LbColor.findByColorJ", query = "SELECT l FROM LbColor l WHERE l.colorJ = :colorJ")
    , @NamedQuery(name = "LbColor.findByBmColorFamily", query = "SELECT l FROM LbColor l WHERE l.bmColorFamily = :bmColorFamily")})
public class LbColor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Short id;
    @Column(name = "color_code")
    private Short colorCode;
    @Column(name = "color_label")
    private String colorLabel;
    @Column(name = "color_j")
    private String colorJ;
    @JoinColumn(name = "bm_color_family")
    private BmColor bmColorFamily;

    public LbColor() {
    }

    public LbColor(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getColorCode() {
        return colorCode;
    }

    public void setColorCode(Short colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(String colorLabel) {
        this.colorLabel = colorLabel;
    }

    public String getColorJ() {
        return colorJ;
    }

    public void setColorJ(String colorJ) {
        this.colorJ = colorJ;
    }

    public BmColor getBmColorFamily() {
        return bmColorFamily;
    }

    public void setBmColorFamily(BmColor bmColorFamily) {
        this.bmColorFamily = bmColorFamily;
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
        if (!(object instanceof LbColor)) {
            return false;
        }
        LbColor other = (LbColor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.LbColor[ id=" + id + " ]";
    }
    
}
