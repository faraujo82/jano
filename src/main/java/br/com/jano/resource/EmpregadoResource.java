package br.com.jano.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.jano.model.BancoDados;
import br.com.jano.model.Empregado;

@Path("/EmpregadoResource")
public class EmpregadoResource {

	@GET
	@Produces( { MediaType.APPLICATION_XML})
	public List<Empregado> getAllEmpregados() {
	return BancoDados.getAllEmpregados();
	}
	 
	@GET
	@Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("{id}")
	public Empregado getEmpregado(@PathParam("id") int id) {
	return BancoDados.getEmpregado(id);
	}
}
