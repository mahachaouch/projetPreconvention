/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExposRest;

import com.google.gson.Gson;
import entities.Preconvention;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import services.UnivBeanLocal;

/**
 *
 * @author maha-
 */
@Path("preconventions/{refPreconv}")
public class PreconvRessource {
    UnivBeanLocal univBean;
    
    
    @Context
    private UriInfo context;
    private Gson gson;

    public PreconvRessource(UnivBeanLocal univBean, Gson gson) {
        this.univBean = lookupUnivBeanLocal();
        this.gson = gson;
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("refPreconv") String refPreconv) {
        return this.gson.toJson(this.univBean.getPrevention(Integer.parseInt(refPreconv)));
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response validerS(@PathParam("refPreconv") String refPreconv, @QueryParam("validS") String validS){
       int ref = Integer.parseInt(refPreconv); 
       boolean val= Boolean.parseBoolean(validS);
        Preconvention prec = this.univBean.validerScolarite(ref,val);
        return Response.ok(this.gson.toJson(prec)).build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response validerE(@PathParam("refPreconv") String refPreconv, @QueryParam("validE") String validE){
       int ref = Integer.parseInt(refPreconv); 
       boolean val= Boolean.parseBoolean(validE);
        Preconvention prec = this.univBean.validerEnseignement(ref,val);
        return Response.ok(this.gson.toJson(prec)).build();
    }
 
     /**
     * Permet de créditer ou de débiter (en fonction du signe de la somme) un compte Pour l'appeler on doit utiliser une URL du type :
     * http://localhost:8080/BanqueREST/webresources/comptes/1?validJ=true
     *
     * @param refPreconv la pré-convention
     * @param validJ    le boolean de validation juridique (true = validée, false= refusée)
     *
     * @return la nouvelle preconvention en notation JSON après miseà jour de son boolean de validation juridique
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response validerj(@PathParam("refPreconv") String refPreconv, @QueryParam("validJ") String validJ){
       int ref = Integer.parseInt(refPreconv); 
       boolean val= Boolean.parseBoolean(validJ);
        Preconvention prec = this.univBean.validerJuridique(ref,val);
        return Response.ok(this.gson.toJson(prec)).build();
    }
    
    
    private UnivBeanLocal lookupUnivBeanLocal() {        try {
            javax.naming.Context c = new InitialContext();
            return (UnivBeanLocal) c.lookup("java:global/BanqueJEE-REST/BanqueEJB/BanqueBean!services.UnivBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
    
    
}
