package za.ac.cput.aphiwe.domain;

/**
 * Created by Aphish on 2016/04/02.
 */
public class MainActor implements Role {

    private String name;

    public String getName() {
        return name;
    }

    private MainActor(Builder build){
        this.name=build.name;
    }

    public String createRole(String name) {
        return "Main Actor";
    }

    public static class Builder{
        private String name;

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(MainActor main){
            this.name=main.name;
            return this;
        }

        public MainActor build(){
            return new MainActor(this);
        }
    }

    public Builder builder(){
        return new Builder();
    }

}
