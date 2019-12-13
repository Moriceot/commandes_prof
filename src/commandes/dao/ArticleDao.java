package commandes.dao;

import java.util.logging.Logger;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import commandes.entities.Article;

@Singleton
public class ArticleDao {
	private static final Logger LOG = Logger.getLogger("COMMANDES");
	@PersistenceContext(name="commandes") private EntityManager em;
	
	public void save(Article article) {
		em.persist(article);
	}
	
	public Article find(long id) {
		return em.find(Article.class, id);
	}
	
	public void update(Article article) {
		em.merge(article);
	}
}
