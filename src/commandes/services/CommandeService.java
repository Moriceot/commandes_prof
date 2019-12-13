package commandes.services;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import commandes.dao.ArticleDao;
import commandes.entities.Article;

@Singleton
public class CommandeService {
	@EJB private ArticleDao articleDao;
	
	public Article findArticleById(long id) {
		return articleDao.find(id);
	}
	
	public long save(Article article) {
		articleDao.save(article);
		return article.getId();
	}
}
