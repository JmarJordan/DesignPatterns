package patterns.builder;

/**
 * @author ef-jeymar
 */

/**
 * BUILDER PATTERN
 *
 * Uses an inner static class to build an object instance
 *
 * */
public class SampleBean {

    public static class Builder{
        private String firstPart;
        private String secondPart;
        private String thirdPart;

        public Builder(){}

        public SampleBean build(){
            return new SampleBean(this);
        }

        public Builder firstPart(String firstPart){
            this.firstPart = firstPart;
            return(this);
        }

        public Builder secondPart(String secondPart){
            this.secondPart = secondPart;
            return(this);
        }

        public Builder thirdPart(String thirdPart){
            this.thirdPart = thirdPart;
            return(this);
        }

    }
    private String firstPart;
    private String secondPart;
    private String thirdPart;

    public String getFirstPart() {
        return firstPart;
    }

    public String getSecondPart() {
        return secondPart;
    }

    public String getThirdPart() {
        return thirdPart;
    }
    private SampleBean(Builder builder){
        this.firstPart = builder.firstPart;
        this.secondPart = builder.secondPart;
        this.thirdPart = builder.thirdPart;
    }
}
