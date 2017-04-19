package content.page;

import com.psddev.cms.db.Content;
import com.psddev.cms.db.PageFilter;
import com.psddev.cms.view.ViewBinding;
import com.psddev.dari.util.StringUtils;

@ViewBinding(value = PageViewModel.class, types = PageFilter.PAGE_VIEW_TYPE)
public abstract class Page extends Content {

    private String title;

    private String subtitle;

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getLabel() {
        return StringUtils.toLabel(getClass().getSimpleName());
    }
}
