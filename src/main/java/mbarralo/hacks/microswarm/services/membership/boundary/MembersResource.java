package mbarralo.hacks.microswarm.services.membership.boundary;

import mbarralo.hacks.microswarm.services.membership.control.MemberRepository;
import mbarralo.hacks.microswarm.services.membership.entity.Member;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("members")
public class MembersResource {

    @Inject
    MemberRepository memberRepository;

    @GET
    @Produces("application/json")
    public List<Member> getAllMembers() {
        return memberRepository.getAllMembers();
    }
}
