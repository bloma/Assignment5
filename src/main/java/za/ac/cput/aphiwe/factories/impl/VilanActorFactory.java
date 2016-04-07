package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.VilanActor;

/**
 * Created by Aphish on 2016/04/07.
 */
public class VilanActorFactory {

    private static VilanActorFactory factory = null;

    private VilanActorFactory(){}

    public static VilanActorFactory getInstance(){
        if (factory==null)
            factory=new VilanActorFactory();
        return factory;
    }

    public VilanActor createActor(String name){
        VilanActor vilan = new VilanActor
                .Builder()
                .Name(name)
                .build();
        return vilan;
    }
}
