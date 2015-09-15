package problema_clases;
class Compositor
{
	private String nombre;
	private String rut;

	public Compositor(String nom, String r)
	{
		nombre= nom;
		rut =r;
	}

	public String getNombre()
	{
		return nombre;
	}
	public String getRut()
	{
		return rut;
	}
	
	public void setNombre(String n)
	{
		nombre = n;
	}
	public void setRut(String r)
	{
		rut = r;
	}

}
