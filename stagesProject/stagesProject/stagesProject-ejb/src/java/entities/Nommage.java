package messages;

/**
 *
 * @author elavinal
 */
public class Nommage {
    
    public final static String FABRIQUE_CONNEXIONS = "jms/__defaultConnectionFactory";
    
    public final static String TOPIC_CMDS_EMISES = "jms/CommandesEmises";
    public final static String TOPIC_CMDS_TRAITEES = "jms/CommandesTraitees";
    public final static String QUEUE_GESTION_CMDS = "jms/GestionnaireCommandes";
    
    public final static String MSG_STOCK = "STOCK";
    public final static String MSG_FACTURATION = "FACTURATION";
    public final static String MSG_CMD_ANNULEE = "CMD_ANNULEE";
    public final static String MSG_CMD_VALIDE = "CMD_VALIDE";
    
    
}
