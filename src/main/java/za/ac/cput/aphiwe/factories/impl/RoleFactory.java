package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.MainActor;
import za.ac.cput.aphiwe.factories.Role;
import za.ac.cput.aphiwe.domain.VilanActor;

/**
 * Created by Aphish on 2016/04/02.
 */
public class RoleFactory {
    private RoleFactory roleFactory = null;
    private RoleFactory(){
    }

    private RoleFactory getInstance(){
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
}
