package com.restpractica2;

@Path("/mensaje")
public class Mensaje {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String diHola()
	{
		return "Hola Camello";
	}
}
