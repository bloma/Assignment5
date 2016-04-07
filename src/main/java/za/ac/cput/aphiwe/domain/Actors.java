package za.ac.cput.aphiwe.domain;

import java.io.Serializable;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Actors implements Serializable{
    private String actorsName;
    private String actorsSurname;
    private Role role;

    public Actors(String actorsName, String actorsSurname, Role role) {
        this.actorsName = actorsName;
        this.actorsSurname = actorsSurname;
        this.role = role;
    }

    public String getActorsName() {
        return actorsName;
    }

    public String getActorsSurname() {
        return actorsSurname;
    }

    public Role getRole() {
        return role;
    }

    public Actors(){}

    private Actors(Builder builder){
        this.actorsName=builder.actorsName;
        this.actorsSurname=builder.actorsSurname;
        this.role=builder.role;

    }

    public static class Builder{
        private String actorsName;
        private String actorsSurname;
        private Role role;

        public Builder actorsName(String value){
            this.actorsName =value;
            return this;
        }

        public Builder actorsSurname(String value){
            this.actorsSurname=value;
            return this;
        }

        public Builder role(Role value){
            this.role = value;
            return this;
        }

        public Builder copy(Actors value){
            this.actorsName = value.actorsName;
            this.actorsSurname = value.actorsSurname;
            this.role = value.role;
            return this;
        }

        public Actors build(){
            return new Actors(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actors actors = (Actors) o;

        if (!actorsName.equals(actors.actorsName)) return false;
        if (!actorsSurname.equals(actors.actorsSurname)) return false;
        return role.equals(actors.role);

    }

    @Override
    public int hashCode() {
        int result = actorsName.hashCode();
        result = 31 * result + actorsSurname.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "actorsName='" + actorsName + '\'' +
                ", actorsSurname='" + actorsSurname + '\'' +
                ", role=" + role +
                '}';
    }
}
