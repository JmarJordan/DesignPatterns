package patterns.factory.sites;

import patterns.factory.pages.CartPage;
import patterns.factory.pages.HomePage;
import patterns.factory.pages.ItemPage;

public class Shop extends Website{
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new HomePage());
        pages.add(new ItemPage());
    }
}
