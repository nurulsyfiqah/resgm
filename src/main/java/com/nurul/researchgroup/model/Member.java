package com.nurul.researchgroup.model;
import org.springframework.data.mongodb.core.mapping.Document;


public class Member {

    private String memberEmail;
    private int status;
    private String memberId;

    public Member() {
        super();
    }

    public Member(String memberEmail, int status, String memberId) {
        this.memberEmail = memberEmail;
        this.status = status;
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
