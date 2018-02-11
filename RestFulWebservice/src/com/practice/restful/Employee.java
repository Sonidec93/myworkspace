package com.practice.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emp")
public class Employee {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message(){
		return "Yayy web services are fun";
	}
}
