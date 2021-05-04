package Data;

import java.util.ArrayList;
import java.util.List;

public class QualityControlSenior implements Role{

    @Override
    public String getRoleName() {
        return "Quality Control Senior";
    }

    @Override
    public Boolean getLeads() {
        return true;
    }

    @Override
    public List<String> getResponsabilities() {
        List responsibilities = new ArrayList();
        responsibilities.add("Responsibilitie 1");
        responsibilities.add("Responsibilitie 2");
        return responsibilities;
    }

    @Override
    public List<String> getAbilities() {
        List abilities = new ArrayList();
        abilities.add("Abilities 1");
        abilities.add("Abilities 2");
        return abilities;
    }
}

