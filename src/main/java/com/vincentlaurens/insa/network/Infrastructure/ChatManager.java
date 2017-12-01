package com.vincentlaurens.insa.network.Infrastructure;

public class ChatManager {
    private final Sessions session;
    private Users user;

    public ChatManager(){
        this.session = new Sessions();
        this.user = new Users(null, null, "vince", "toto");
    }

   public String userLogin(){
        return  this.user.useLoginUser();
   }
   public String userPassword(){
       return this.user.usePasswordUser();
   }
   public void addPseudotoUser(String pseudo){
       this.user.userPseudoadd(pseudo);
   }
    public String userPseudo(){
        return this.user.usePseudoUser();
    }


}
