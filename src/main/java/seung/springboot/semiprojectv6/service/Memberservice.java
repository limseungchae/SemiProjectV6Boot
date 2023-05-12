package seung.springboot.semiprojectv6.service;

import seung.springboot.semiprojectv6.model.Member;

import javax.servlet.http.HttpSession;

public interface Memberservice {
    boolean checkLogin(Member m, HttpSession sess);
}
