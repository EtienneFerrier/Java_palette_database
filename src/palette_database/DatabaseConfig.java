package palette_database;

import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.lexical_db.NictWordNet;

public class DatabaseConfig {
	
    public static ILexicalDatabase db = new NictWordNet();
    
    public static void bootWordNetSQL() {
    	//db.getAllConcepts("pencil", "n");
    }
    
}
