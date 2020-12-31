package icu.bibilailai.core.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

@JsonIgnoreProperties(value = {"fullName", "comment"})
public class User {
    private Long id;
    @Value("${your_name}")
    private String name;
    @Value("${my.secret}")
    private String fullName;
    private String comment;
    private String mail;
    @JsonIgnore
    private String address;
    @JsonFormat
    private Date regDate;

    private Date reg2Date;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getReg2Date() {
        return reg2Date;
    }

    public void setReg2Date(Date reg2Date) {
        this.reg2Date = reg2Date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", comment='" + comment + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", regDate=" + regDate +
                ", reg2Date=" + reg2Date +
                '}';
    }
}
