package problema_clases;
class  Disco
{
	//atributos privados
	private String titulo;
	private ListaCompositor compositores;
	private ListaCancion canciones;

	//constructor
	public Disco(String tit, int largo_comp,int largo_canc)
	{
		titulo = tit;
		compositores = new ListaCompositor(largo_comp);
		canciones = new ListaCancion(largo_canc);
	}

	//metodos get y set
	public String getTitulo()
	{
		return titulo;
	}

	public ListaCompositor getCompositor()
	{
		return compositores;
	}

	public ListaCancion getCanciones()
	{
		return canciones;
	}
	
	public void setTitulo(String t)
	{
		titulo = t;
	}

	public  void setCompositor(ListaCompositor lista)
	{
		compositores = lista;
	}

	public void getCanciones(ListaCancion lista)
	{
		canciones = lista;
	}

	
}
