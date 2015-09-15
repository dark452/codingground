package problema_clases;
class  ListaCancion
{
	private int largo_real;
	private int max;
	private Cancion[] lista;

	public ListaCancion(int max)
	{
		this.max = max;
		largo_real = 0;
		lista = new Cancion[max];
	}

	public int getLargo()
	{
		return largo_real-1;
	}

	public void ingresaOrdenado(Cancion c)
	{
		if (largo_real <max)
		{
			lista[largo_real]= c;
			largo_real ++;
		}
		
	}

	public Cancion buscar(String nombre)
	{
		Cancion c = null;
		if (largo_real > 0)
		{
			for (int i = 0;i<largo_real ;i++ )
			{
				if (lista[i].getTitulo().equals(nombre))
				{
					c= lista[i];
				}
			}
		}
		return c;
	}
	
	public boolean eliminar(String nombre)
	{
		boolean respuesta = false;
		int posicion =0;
		if (largo_real > 0)
		{
			for (int i = 0;i<largo_real ;i++ )
			{
				if (lista[i].getTitulo().equals(nombre))
				{
					posicion = i;
				}
			}
		}
		if (lista[posicion].getTitulo().equals(nombre))
		{
			for (int i = posicion;i <largo_real-1 ;i++ )
			{
				lista[i] = lista[i+1];
			}
			lista[largo_real]= null;
			largo_real = largo_real-1;
			respuesta = true;
		}
		return respuesta;
	}
	public void ordenar()
	{
		Cancion c = null;
		System.out.println("largo = "+largo_real);
		for (int i=0;i<=largo_real-1 ;i++)
		{
			
			for (int k=i+1;k<largo_real ;k++ )
			{
				if (0 <(lista[i].getTitulo().compareTo(lista[k].getTitulo())))
				{
					c = lista[i];
					lista[i] = lista[k];
					lista[k] = c;
				}
			}
		}

	}

	public Cancion getCancion(int pos)
	{
		Cancion c = null;
		if (pos < largo_real)
		{
			c= lista[pos];
		}
		return c;
	}



}

