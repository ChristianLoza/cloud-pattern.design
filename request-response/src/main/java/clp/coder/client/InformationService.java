package clp.coder.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("")
@RegisterRestClient(configKey = "ipinfo")
public interface InformationService {
    @GET
    IpInformation getIP();
}
