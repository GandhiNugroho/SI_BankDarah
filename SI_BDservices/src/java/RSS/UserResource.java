/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSS;

import com.google.gson.Gson;
import helper.UserHelper;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import pojos.User;

/**
 *
 * @author asus
 */
@Path("user")
public class UserResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of pasienResource
     */
    public UserResource() {
    }

    /**
     * Retrieves representation of an instance of service.pasienResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        UserHelper test = new UserHelper();
        List<User> list = test.getAllUser();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response
                .status(200)
                .entity(json)
                .build();
    }

    /**
     * PUT method for updating or creating an instance of pasienResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
//    @PUT
//    @Consumes("application/json")
//    public void putJson(String content) {
//    }
    @GET
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("username") String username, @QueryParam("password") String password) {
        return new Gson().toJson(new UserHelper().login(username, password));
    }
}
