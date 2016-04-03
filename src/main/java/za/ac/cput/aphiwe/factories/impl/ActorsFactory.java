package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Actors;
import za.ac.cput.aphiwe.factories.Role;

import java.util.UUID;

/**
 * Created by Aphish on 2016/04/03.
 */
public class ActorsFactory implements Role{

    private static ActorsFactory actorsFactory = null;

    private ActorsFactory(){}

    public static ActorsFactory getInstance(){
        if (actorsFactory==null)
            actorsFactory=new ActorsFactory();
        return actorsFactory;
    }

    public  Actors createRole(String name, String description) {
        Actors  role = new Actors
                .Builder()
                .actorsName(UUID.randomUUID().toString())
                .actorsName(name)
                .actorsSurname(description)
                .build();
        return role;
    }

}
