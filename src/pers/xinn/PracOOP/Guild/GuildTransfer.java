package pers.xinn.PracOOP.Guild;


import pers.xinn.PracOOP.Guild.Enums.Permissions;

public class GuildTransfer {

    public Guild Transfer(Guild oldGuid, Permissions permissions){
     return new Guild(oldGuid.getUsername(), oldGuid.getPassword(), permissions );
    }
}
