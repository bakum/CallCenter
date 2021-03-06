/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.divas.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.divas.model.entity.CompaignsDetails;

/**
 *
 * @author igor
 */
@Stateless
public class CompaignsDetailsFacade extends AbstractFacade<CompaignsDetails> {
    @PersistenceContext(unitName = "CallCenterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompaignsDetailsFacade() {
        super(CompaignsDetails.class);
    }
    
}
