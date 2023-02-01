package patterns.factory.sites;

import patterns.factory.pages.AboutPage;
import patterns.factory.pages.HomePage;
import patterns.factory.pages.PostPage;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new HomePage());
        pages.add(new PostPage());
        pages.add(new AboutPage());
    }
}
