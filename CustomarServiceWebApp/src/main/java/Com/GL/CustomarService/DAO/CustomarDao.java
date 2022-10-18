package Com.GL.CustomarService.DAO;

import java.util.List;

import Com.GL.CustomarService.Model.Customar;

public interface CustomarDao {

	public void saveCustomar(Customar customar);

	public void DeleteCustomar(int id);

	public List<Customar> findAll();

	public Customar findbyid(int id);
}
