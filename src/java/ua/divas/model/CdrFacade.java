package ua.divas.model;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.divas.model.entity.Cdr;


@Stateless
public class CdrFacade extends AbstractFacade<Cdr> {
    @PersistenceContext(unitName = "CallCenterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CdrFacade() {
        super(Cdr.class);
    }
    public void add(Cdr cdr){
        em.persist(cdr);
    }
    

    public List<Cdr> findByUserId(String userId){
        return em.createNamedQuery("Cdr.findByUserId").setParameter("userId", userId).getResultList();       
    }
}
