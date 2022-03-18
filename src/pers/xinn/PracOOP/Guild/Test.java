package pers.xinn.PracOOP.Guild;

import pers.xinn.PracOOP.Guild.Enums.Permissions;

public class Test{
    public static void main(String[] args) {

        Permissions Guest;
        Guild guest = new Guild("123","123",Permissions.GUEST);

        Guild transfored = new GuildTransfer().Transfer(guest,Permissions.SVIP);
    }





}
