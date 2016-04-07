package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.MainActor;

/**
 * Created by Aphish on 2016/04/07.
 */
public class MainActorsFactory {

    private static MainActorsFactory factory = null;

    private MainActorsFactory(){}

    public static MainActorsFactory getInstance(){
        if (factory==null)
            factory=new MainActorsFactory();
        return factory;
    }

    public MainActor createActor(String name){
        MainActor actor = new MainActor
                .Builder()
                .Name(name)
                .build();
        return actor;

    }
}
