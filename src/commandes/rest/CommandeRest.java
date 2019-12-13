package commandes.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import commandes.entities.Article;
import commandes.services.CommandeService;

@Path("/cde")
public class CommandeRest {
	@EJB CommandeService service;
	
	@GET
	@Path("/article/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Article findArticleById(@PathParam("id") long id) {
		return service.findArticleById(id);
	}
	
	
	@POST
	@Path("/article/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public long save(Article article) {
		return service.save(article);
	}
}
