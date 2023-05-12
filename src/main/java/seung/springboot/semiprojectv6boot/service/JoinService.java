package seung.springboot.semiprojectv6boot.service;

import seung.springboot.semiprojectv5.model.Member;

public interface JoinService {

    String findZipcode(String dong);

    boolean newMember(Member m);

    boolean checkUserid(String uid);

    boolean loginMember(Member m);
}
