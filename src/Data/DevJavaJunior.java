package Data;

import java.util.ArrayList;
import java.util.List;

public class DevJavaJunior implements Role{

    @Override
    public String getRoleName() {
        return "Java Developer Junior";
    }

    @Override
    public Boolean getLeads() {
        return false;
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
        abilities.add("Abilities 3");
        return abilities;
    }
}

