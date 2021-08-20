package entities;

import entities.Brand;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-08-20T11:24:17")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Double> originalPrice;
    public static volatile SingularAttribute<Item, Boolean> isDutiable;
    public static volatile SingularAttribute<Item, String> description;
    public static volatile SingularAttribute<Item, Double> packing;
    public static volatile SingularAttribute<Item, String> url;
    public static volatile SingularAttribute<Item, String> reference;
    public static volatile SingularAttribute<Item, Integer> itemId;
    public static volatile SingularAttribute<Item, Double> postage;
    public static volatile SingularAttribute<Item, String> itemName;
    public static volatile SingularAttribute<Item, String> saleInfo;
    public static volatile SingularAttribute<Item, Boolean> listed;
    public static volatile SingularAttribute<Item, String> serial;
    public static volatile SingularAttribute<Item, Double> price;
    public static volatile SingularAttribute<Item, String> season;
    public static volatile SingularAttribute<Item, String> details;
    public static volatile SingularAttribute<Item, Brand> brand;

}