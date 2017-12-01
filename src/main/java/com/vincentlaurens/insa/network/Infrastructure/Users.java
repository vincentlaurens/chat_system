package com.vincentlaurens.insa.network.Infrastructure;

public class Users {

    private String pseudo;
    private String ip;
    private String login;
    private String password;

    public Users(String pseudo, String ip, String login, String password){
        this.pseudo = pseudo;
        this.ip = ip;
        this.login = login;
        this.password = password;
    }
    public String usePseudoUser(){
        return this.pseudo;

    }
    public String useLoginUser(){
        return this.login;

    }
    public String usePasswordUser(){
        return this.password;

    }
    public void userPseudoadd(String pseudo){
        this.pseudo = pseudo;
    }
}
