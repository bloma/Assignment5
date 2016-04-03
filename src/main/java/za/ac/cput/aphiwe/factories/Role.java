package za.ac.cput.aphiwe.factories;

import za.ac.cput.aphiwe.domain.Actors;

/**
 * Created by Aphish on 2016/04/02.
 */
public interface Role {
    Actors createRole(String name, String description);
}
