package Data;

import java.util.List;

public interface Role {
    public String getRoleName();
    public Boolean getLeads();
    public List<String> getResponsabilities();
    public List<String> getAbilities();

}
