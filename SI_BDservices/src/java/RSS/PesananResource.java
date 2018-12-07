/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSS;

import com.google.gson.Gson;
import helper.PesananHelper;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import pojos.Pesanan;

/**
 *
 * @author asus
 */
@Path("pesanan")
public class PesananResource {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SI_BDResource
     */
    public PesananResource() {
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
        PesananHelper p = new PesananHelper();
        Gson gson = new Gson();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(p.bacaSemuaPesanan()))
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
    @Path("addPesanan")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response AddNewDarah(String data) {
        Gson gson = new Gson();
        Pesanan pesanan = gson.fromJson(data, Pesanan.class);
        PesananHelper helper = new PesananHelper();
        helper.addNewPesanan(
                pesanan.getIdDarah(), 
                pesanan.getNamaRs(), 
                pesanan.getAlamatRs(), 
                pesanan.getTanggalPesan());
        return Response.status(200).entity(pesanan).build();
    }
}
