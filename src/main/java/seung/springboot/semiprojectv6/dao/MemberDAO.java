package seung.springboot.semiprojectv6.dao;

import seung.springboot.semiprojectv6.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
