package seung.springboot.semiprojectv6boot.dao;

import seung.springboot.semiprojectv5.model.Member;
import seung.springboot.semiprojectv5.model.Zipcode;

import java.util.List;

public interface joinDAO {

    List<Zipcode> selectZipcode(String dong);

    int newMember(Member m);

    int selectOneUserid(String uid);

    int selectOneMember(Member m);

    int insertMember(Member m);
}
