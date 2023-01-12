package org.example.domain;

public class User {

    private Long Userid;
    private String Username;
    private String Userpw;

    public Long getUserid() {
        return Userid;
    }

    public void setUserid(Long userid) {
        Userid = userid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserpw() {
        return Userpw;
    }

    public void setUserpw(String userpw) {
        Userpw = userpw;
    }
}