/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSS;

import com.google.gson.Gson;
import helper.DataDarahHelper;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.DataDarah;
import helper.DataDarahHelper;

/**
 * REST Web Service
 *
 * @author admin
 */
@Path("SI_BD")
public class SI_BDResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SI_BDResource
     */
    public SI_BDResource() {
    }

    /**
     * Retrieves representation of an instance of RSS.SI_BDResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        DataDarahHelper p = new DataDarahHelper();
        Gson gson = new Gson();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(p.bacaSemuaDataDarah()))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "20")
                .header("Access-Preflight-Maxage", "20")
                .build();
    }

    @POST
    @Path("addDarah")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response AddNewDarah(String data) {
        Gson gson = new Gson();
        DataDarah datadarah = gson.fromJson(data, DataDarah.class);
        DataDarahHelper helper = new DataDarahHelper();
        helper.addNewDataDarah(datadarah.getIdDarah(),
                datadarah.getGolonganDarah(),
                datadarah.getResus(),
                datadarah.getPendonor(),
                datadarah.getTanggalDonor(),
                datadarah.getAlamatPendonor(),
                datadarah.getStatus());
        return Response.status(200).entity(datadarah).build();
    }


}
