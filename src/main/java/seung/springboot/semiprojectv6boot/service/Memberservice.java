package seung.springboot.semiprojectv6boot.service;

import seung.springboot.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface Memberservice {
    boolean checkLogin(Member m, HttpSession sess);
}
