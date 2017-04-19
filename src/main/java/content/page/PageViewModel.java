package content.page;

import java.util.List;

import com.google.common.collect.Lists;
import com.psddev.base.view.core.page.PageView;
import com.psddev.base.view.core.page.PageViewBodyField;
import com.psddev.cms.view.ViewModel;

public class PageViewModel extends ViewModel<Page> implements PageView {

    @Override
    public CharSequence getKeywords() {
        return null;
    }

    @Override
    public CharSequence getDescription() {
        return "page description";
    }

    @Override
    public CharSequence getTitle() {
        return "page title";
    }

    @Override
    public Iterable<? extends PageViewBodyField> getBody() {
        return createViews(PageViewBodyField.class, model);
    }

}