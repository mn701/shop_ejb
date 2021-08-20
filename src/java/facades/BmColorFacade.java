/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.BmColor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MN1
 */
@Stateless
public class BmColorFacade extends AbstractFacade<BmColor> {

    @PersistenceContext(unitName = "Shop_ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BmColorFacade() {
        super(BmColor.class);
    }
    
}
