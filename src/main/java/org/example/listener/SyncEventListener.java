package org.example.listener;

import com.gugumin.core.event.AddArticleEvent;
import com.gugumin.core.event.DeleteArticleEvent;
import com.gugumin.core.event.UpdateArticleEvent;
import com.gugumin.core.pojo.Article;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Sync event listener.
 *
 * @author minmin
 * @date 2023 /03/31
 */
@Component
public class SyncEventListener {
    /**
     * Add article.
     *
     * @param addArticleEvent the add article event
     */
    @EventListener(AddArticleEvent.class)
    @Async
    public void addArticle(AddArticleEvent addArticleEvent) {
        List<Article> articleList = addArticleEvent.getArticleList();
        System.out.println("articleList = " + articleList);
    }

    /**
     * Update article.
     *
     * @param updateArticleEvent the update article event
     */
    @EventListener(UpdateArticleEvent.class)
    @Async
    public void updateArticle(UpdateArticleEvent updateArticleEvent) {
        List<Article> articleList = updateArticleEvent.getArticleList();
        System.out.println("articleList = " + articleList);
    }

    /**
     * Delete article.
     *
     * @param deleteArticleEvent the delete article event
     */
    @EventListener(DeleteArticleEvent.class)
    @Async
    public void deleteArticle(DeleteArticleEvent deleteArticleEvent) {
        List<Article> articleList = deleteArticleEvent.getArticleList();
        System.out.println("articleList = " + articleList);
    }
}
