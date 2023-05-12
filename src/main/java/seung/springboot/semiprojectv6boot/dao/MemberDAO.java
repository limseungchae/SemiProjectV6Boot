package seung.springboot.semiprojectv6boot.dao;

import seung.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
