package pers.xinn.PracOOP.Guild;

import pers.xinn.PracOOP.Guild.Enums.Permissions;

public class Guild {
    private Permissions permission;
    private String Username;
    private String Password;


    public Guild(String username, String password, Permissions permission){
        this.Username = username;
        this.Password = password;
        this.permission = permission;
    }


    private void changepermission(Permissions permissions){
        this.permission = permissions;
    }

    public String getUsername(){
        return this.Username;
    }

    public String getPassword(){
        return this.Password;
    }

    public Permissions getPermission(){
        return this.permission;
    }

}
