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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MN1
 */
@Entity
@Table(name = "items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
    , @NamedQuery(name = "Item.findByItemId", query = "SELECT i FROM Item i WHERE i.itemId = :itemId")
    , @NamedQuery(name = "Item.findByBrandId", query = "SELECT i FROM Item i WHERE i.brand = :brand")
    , @NamedQuery(name = "Item.findByItemName", query = "SELECT i FROM Item i WHERE i.itemName = :itemName")
    , @NamedQuery(name = "Item.findByUrl", query = "SELECT i FROM Item i WHERE i.url = :url")
    , @NamedQuery(name = "Item.findBySerial", query = "SELECT i FROM Item i WHERE i.serial = :serial")
    , @NamedQuery(name = "Item.findByPrice", query = "SELECT i FROM Item i WHERE i.price = :price")
    , @NamedQuery(name = "Item.findByOriginalPrice", query = "SELECT i FROM Item i WHERE i.originalPrice = :originalPrice")
    , @NamedQuery(name = "Item.findBySaleInfo", query = "SELECT i FROM Item i WHERE i.saleInfo = :saleInfo")
    , @NamedQuery(name = "Item.findBySeason", query = "SELECT i FROM Item i WHERE i.season = :season")
    , @NamedQuery(name = "Item.findByPostage", query = "SELECT i FROM Item i WHERE i.postage = :postage")
    , @NamedQuery(name = "Item.findByPacking", query = "SELECT i FROM Item i WHERE i.packing = :packing")
    , @NamedQuery(name = "Item.findByListed", query = "SELECT i FROM Item i WHERE i.listed = :listed")
    , @NamedQuery(name = "Item.findByIsDutiable", query = "SELECT i FROM Item i WHERE i.isDutiable = :isDutiable")})
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @JoinColumn(name = "brand_id")
    @ManyToOne
    private Brand brand;
    
    @Column(name = "item_name")
    private String itemName;
 
    @Column(name = "url")
    private String url;

    @Column(name = "serial")
    private String serial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "original_price")
    private Double originalPrice;
   
    @Column(name = "sale_info")
    private String saleInfo;
    @Lob

    @Column(name = "description")
    private String description;
    @Lob

    @Column(name = "details")
    private String details;

    @Column(name = "season")
    private String season;
    @Lob

    @Column(name = "reference")
    private String reference;
    @Column(name = "postage")
    private Double postage;
    @Column(name = "packing")
    private Double packing;
    @Column(name = "listed")
    private Boolean listed;
    @Column(name = "is_dutiable")
    private Boolean isDutiable;

    public Item() {
    }

    public Item(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(String saleInfo) {
        this.saleInfo = saleInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Double getPacking() {
        return packing;
    }

    public void setPacking(Double packing) {
        this.packing = packing;
    }

    public Boolean getListed() {
        return listed;
    }

    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    public Boolean getIsDutiable() {
        return isDutiable;
    }

    public void setIsDutiable(Boolean isDutiable) {
        this.isDutiable = isDutiable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Item[ itemId=" + itemId + " ]";
    }
    
}
