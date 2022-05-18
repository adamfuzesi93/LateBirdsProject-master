package hu.unideb.inf.LateBirds;

import java.util.List;

public interface AdminDAO extends AutoCloseable {
    public void saveAdmin(Admin admin);

    public void deleteAdmin(Admin admin);

    public void updateAdmin(Admin admin);

    public List<Admin> getAdminsAll();

    public Admin getAdminbyName(String admin);

    public List<Admin> getAdminsbyName(String admin);

    public Admin getAdminbyID(int id);
}
