//package problema_clases;
class  ListaCompositor
{
	private int largo_real;
	private int max;
	private Compositor[] lista;

	public ListaCompositor(int max)
	{
		this.max = max;
		largo_real = 0;
		lista = new Compositor[max];
	}

	public int getLargo()
	{
		return largo_real-1;
	}

	public void ingresa(Compositor c)
	{
		if (largo_real <max)
		{
			lista[largo_real]= c;
			largo_real ++;
		}
		
	}

	public Compositor buscar(String nombre)
	{
		Compositor c = null;
		if (largo_real > 0)
		{
			for (int i = 0;i<largo_real ;i++ )
			{
				if (lista[i].getNombre().equals(nombre))
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
				if (lista[i].getNombre().equals(nombre))
				{
					posicion = i;
				}
			}
		}
		if (lista[posicion].getNombre().equals(nombre))
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
		Compositor c = null;
		System.out.println("largo = "+largo_real);
		for (int i=0;i<=largo_real-1 ;i++)
		{
			
			for (int k=i+1;k<largo_real ;k++ )
			{
				if (0 <(lista[i].getNombre().compareTo(lista[k].getNombre())))
				{
					c = lista[i];
					lista[i] = lista[k];
					lista[k] = c;
				}
			}
		}

	}

	public Compositor getCompositor(int pos)
	{
		Compositor c = null;
		if (pos < largo_real)
		{
			c= lista[pos];
		}
		return c;
	}



}
