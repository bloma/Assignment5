package za.ac.cput.aphiwe.domain;

/**
 * Created by Aphish on 2016/04/02.
 */
public class VilanActor implements Role {

   private String name;

    public String getName() {
        return name;
    }

    private VilanActor(Builder builder){
        this.name=builder.name;
    }

    public String createRole(String name) {
        return "Vilan Actor";
    }

    public static class Builder
    {
        private String name;

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(VilanActor vilanActor){
            this.name =vilanActor.name;
            return this;
        }

        public VilanActor build(){
            return new VilanActor(this);
        }
    }

    public static Builder builder(){
        return new Builder();
    }

}
