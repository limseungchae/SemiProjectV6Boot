package seung.springboot.semiprojectv6.dao;

import seung.springboot.semiprojectv6.model.Member;
import seung.springboot.semiprojectv6.model.Zipcode;

import java.util.List;

public interface joinDAO {

    List<Zipcode> selectZipcode(String dong);

    int newMember(Member m);

    int selectOneUserid(String uid);

    int selectOneMember(Member m);

    int insertMember(Member m);
}
