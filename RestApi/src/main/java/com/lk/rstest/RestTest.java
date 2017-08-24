package com.lk.rstest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/webrest")
public class RestTest {

	@GET
	@Path("/name")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String getName(){
		
		System.out.println("name method");
		return "HELLO FY FIRST REST APP";
	}
	
}
