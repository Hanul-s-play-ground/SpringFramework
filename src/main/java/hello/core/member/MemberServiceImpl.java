package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // MemberServiceImpl는 MemberRepository, MemoryMemberRepository에 의존한다.
    // ========> 이는 OCP, DIP 위반
//    private final MemberRepository memberRepository = new MemoryMemberRepository();

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
