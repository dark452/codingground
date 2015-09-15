package problema_clases;
class Cancion 
{
	private String titulo;
	private Compositor comp;

	public Cancion(String titulo, Compositor c)
	{
		this.titulo = titulo;
		comp = c;
	}

	public String getTitulo()
	{
		return titulo;
	}
	public Compositor getCompositor()
	{
		return comp;
	}
	
	public void setTitulo(String t)
	{
		titulo = t;
	}
	public void setCompositor(Compositor c)
	{
		comp = c;
	}

}
