package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Actors;
import za.ac.cput.aphiwe.domain.MainActor;
import za.ac.cput.aphiwe.factories.Role;
import za.ac.cput.aphiwe.domain.VilanActor;

import java.util.UUID;

/**
 * Created by Aphish on 2016/04/02.
 */
public class RoleFactory implements Role{
    private static RoleFactory roleFactory = null;
    private RoleFactory(){
    }

    public static RoleFactory getInstance(){
        if (roleFactory==null){
            roleFactory= new RoleFactory();
        }
        return roleFactory;
    }

    public Role getActorRole(String role){
        if ("MainActor".equalsIgnoreCase(role)){
            return new MainActor();
        }else{
            return new VilanActor();
        }
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
