package patterns.factory.sites;

import lombok.Data;
import patterns.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }
    public abstract void createWebsite();
}
