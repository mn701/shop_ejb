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
@Table(name = "ck_colors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CkColor.findAll", query = "SELECT c FROM CkColor c")
    , @NamedQuery(name = "CkColor.findByColorCode", query = "SELECT c FROM CkColor c WHERE c.colorCode = :colorCode")
    , @NamedQuery(name = "CkColor.findByColorName", query = "SELECT c FROM CkColor c WHERE c.colorName = :colorName")
    , @NamedQuery(name = "CkColor.findByColorJ", query = "SELECT c FROM CkColor c WHERE c.colorJ = :colorJ")
    , @NamedQuery(name = "CkColor.findByBmColorFamily", query = "SELECT c FROM CkColor c WHERE c.bmColorFamily = :bmColorFamily")})
public class CkColor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "color_code")
    private String colorCode;
    @Column(name = "color_name")
    private String colorName;
    @Column(name = "color_j")
    private String colorJ;
    @JoinColumn(name = "bm_color_family")
    private BmColor bmColorFamily;

    public CkColor() {
    }

    public CkColor(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
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
        hash += (colorCode != null ? colorCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CkColor)) {
            return false;
        }
        CkColor other = (CkColor) object;
        if ((this.colorCode == null && other.colorCode != null) || (this.colorCode != null && !this.colorCode.equals(other.colorCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CkColor[ colorCode=" + colorCode + " ]";
    }
    
}
