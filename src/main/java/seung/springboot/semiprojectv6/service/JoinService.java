package seung.springboot.semiprojectv6.service;

import seung.springboot.semiprojectv6.model.Member;

public interface JoinService {

    String findZipcode(String dong);

    boolean newMember(Member m);

    boolean checkUserid(String uid);

    boolean loginMember(Member m);
}
