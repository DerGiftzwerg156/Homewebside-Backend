package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "token")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "token_id", nullable = false)
    private int tokenid;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userid;

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    public Token(User userid, String token, Timestamp timestamp) {
        this.userid = userid;
        this.token = token;
        this.timestamp = timestamp;
    }

    public Token() {
    }

    public int getTokenid() {
        return tokenid;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Token{" +
                "tokenid=" + tokenid +
                ", userid=" + userid +
                ", token='" + token + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
