/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExposRest;

import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import services.UnivBeanLocal;

/**
 *REST Web Service pour l'ensemble des pré conventions
 * @author maha-
 */

@Path("Preconventions")
public class UnivRessource {
    // Accès BackOffice
    UnivBeanLocal univBean;

    @Context
    private UriInfo context;

    // Convertisseur JSON
    private Gson gson;

    public UnivRessource(UnivBeanLocal univBean, Gson gson) {
        this.univBean = lookupUnivBeanLocal();
        this.gson = new Gson();
    }
    
        /**
     * Creation d'un nouveau compte. Le solde est facultatif (défaut = 0.0). Pour appeler cette méthode on doit utiliser l'URL :
     * http://localhost:8080/BanqueREST/webresources/preconventions/?parameterName1=value1&parameterName2=value2
     *
     * @param solde le solde du compte
     *
     * @return le compte en notation JSON de la forme {"idCompte":0,"pos":{"date":1475757207292,"somme":1000.0}}
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String postJson(@QueryParam("etudiant") Integer etudiant,@QueryParam("diplome") String diplome,@QueryParam("entreprise") Integer entreprise,
            @QueryParam("assurance") Integer assurance,@QueryParam("gratification") float gratification,@QueryParam("debut") String debut,@QueryParam("fin") String fin,@QueryParam("sujet") String sujet) {

    return this.gson.toJson(this.univBean.ajouterPreConvention(etudiant,diplome,entreprise,assurance,gratification, SimpleDateFormat.parse(debut),fin,sujet));
    }
    
    
    
    private UnivBeanLocal lookupUnivBeanLocal() {  
        try {
            javax.naming.Context c = new InitialContext();
            return (UnivBeanLocal) c.lookup("java:global/BanqueJEE-REST/BanqueEJB/BanqueBean!services.UnivBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    } 
    
}
