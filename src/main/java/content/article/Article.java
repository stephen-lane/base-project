package content.article;

import com.psddev.cms.db.Directory;
import com.psddev.cms.db.PageFilter;
import com.psddev.cms.db.Site;
import com.psddev.cms.db.ToolUi;
import com.psddev.cms.view.ViewBinding;
import com.psddev.dari.db.Recordable;

import content.page.Page;

@ViewBinding(value = ArticleBodyViewModel.class)
public class Article extends Page implements Directory.Item {

    @Recordable.Required
    private String headline;

    @ToolUi.RichText
    private String body;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String createPermalink(Site site) {
        // TODO Auto-generated method stub
        return null;
    }
}

