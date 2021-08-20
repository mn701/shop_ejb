/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.LbColor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MN1
 */
@Stateless
public class LbColorFacade extends AbstractFacade<LbColor> {

    @PersistenceContext(unitName = "Shop_ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LbColorFacade() {
        super(LbColor.class);
    }
    
}
