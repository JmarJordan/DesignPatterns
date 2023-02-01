import patterns.factory.WebsiteFactory;
import patterns.factory.enums.SiteType;
import patterns.factory.sites.Website;
import patterns.prototype.Prototype;
import patterns.builder.Record;
import patterns.builder.SampleBean;
import patterns.singleton.Singleton;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /** SINGLETON */

        Singleton s = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        if(s == s2){
            System.out.println("They are the same.");
        }


        /** BUILDER */

        SampleBean.Builder builder = new SampleBean.Builder();
        SampleBean sample = builder.firstPart("One").secondPart("Two").thirdPart("Three").build();

        System.out.println(sample.getFirstPart());
        System.out.println(sample.getSecondPart());
        System.out.println(sample.getThirdPart());

        /** PROTOTYPE */

        String sql = "SELECT * FROM movies_db WHERE title = ?";
        List<String> params = Arrays.asList("127 Hours");
        Record record = new Record();

        Prototype firstProto = new Prototype(sql, params, record);
        System.out.println(firstProto.getSql());
        System.out.println(firstProto.getParams());
        System.out.println(firstProto.getRecord());

        Prototype secondProto = firstProto.clone();
        System.out.println(secondProto.getSql());
        System.out.println(secondProto.getParams());
        System.out.println(secondProto.getRecord());

        /** FACTORY */

        Website site = WebsiteFactory.getWebsite(SiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(SiteType.SHOP);
        System.out.println(site.getPages());
    }
}
