package mbarralo.hacks.microswarm.services.membership.control;

import mbarralo.hacks.microswarm.services.membership.entity.Member;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class MemberRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Member> getAllMembers() {
        return entityManager.createQuery("from Member", Member.class).getResultList();
    }
}
