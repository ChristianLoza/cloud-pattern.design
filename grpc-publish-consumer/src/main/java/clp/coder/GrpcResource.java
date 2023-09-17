package clp.coder;

import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class GrpcResource {

	@GrpcClient
	HelloGrpc helloGrpc;

	@GET
	@Path("{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Uni<String> saludo(String name) {
		return helloGrpc.sayHello(HelloRequest.newBuilder().setName(name).build()).onItem()
				.transform(helloReply -> helloReply.getMessage());
	}
}
