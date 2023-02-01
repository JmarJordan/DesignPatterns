package patterns.factory;

import patterns.factory.enums.SiteType;
import patterns.factory.sites.Blog;
import patterns.factory.sites.Shop;
import patterns.factory.sites.Website;

/**
 * @author ef-jeymar
 */

/**
 * FACTORY
 *
 * Utilizes subclasses and interfaces in order to perform dynamic object creation at runtime
 * */
public class WebsiteFactory {

    public static Website getWebsite(SiteType type){
        switch (type){
            case BLOG:{
                return new Blog();
            }
            case SHOP:{
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
