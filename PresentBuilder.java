import java.util.List;

import src.Present;
import src.Sweet;

public class PresentBuilder {

        public static Present createPresent() {
    
            FileUtils utils = new FileUtils();
    
            List<Sweet> list = utils.getSweetsListFromFile();
    
            Present pres = new Present(list);
    
            return pres;
        }
    
    }
    

