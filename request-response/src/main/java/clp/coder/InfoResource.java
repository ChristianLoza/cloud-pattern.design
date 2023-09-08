package clp.coder;

import clp.coder.client.InformationService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("ip")
public class InfoResource {
    @RestClient
    InformationService informationService;

    @GET
    public Response getInfoIP(){
        return Response.ok(informationService.getIP()).build();
    }
}
