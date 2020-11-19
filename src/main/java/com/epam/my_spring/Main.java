package com.epam.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();

        //todo add support for @InjectRandomString(type=StringTypes.CHUCK_NORRIS_QUOTE, type = StringTypes.GAME_OF_THRONES)
        // todo write support for running automticly all methods which starts with init
    }
}
