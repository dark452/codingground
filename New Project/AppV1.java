/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;

/**
 *
 * @author ingeborg.munoz
 */
public class AppV1 {
    static ListaCompositor lco = new ListaCompositor(100);
    static ListaDisco ldi = new ListaDisco(100);
    
    public static void main(String[] args) throws IOException 
	{
                  
		MenuPrincipal();
                int opcion = Lectura.getInt();
                while(opcion!=9){
                        switch(opcion){
                            case 1:
                                    System.out.println("Seleccione el compositor de la cancion "+lco.getLargo());
                                    if(lco.getLargo()>0){
                                        ListadoCompositor();
                                        String nombre = Lectura.getString();
                                        Compositor c1 = lco.buscar(nombre);
                                        System.out.println("Ingrese Titulo del disco");
                                        String titulo = Lectura.getString();
                                     //   Disco d = new Disco()
                                        System.out.println("L "+lco.getLargo());
                                    }else{
                                        System.out.println("No existen compositores en la APP, por favor ingresesar a la opcion 2");
                                    }
                                    break;
                            case 2:
                                    System.out.println("Compositores actuales: "+lco.getLargo());
                                    if(lco.getLargo()>0){
                                        ListadoCompositor();
                                        System.out.println("Ingrese el nombre");
                                        String nombre = Lectura.getString();
                                        Compositor c1 = lco.buscar(nombre);
                                        if (c1 == null){
                                            System.out.println("Ingrese el rut");
                                            String rut = Lectura.getString();
                                            c1.setNombre(nombre);
                                            c1.setRut(rut);
                                            lco.ingresa(c1);
                                        }else{
                                            System.out.println("Este compositor ya existe en la APP");
                                        }
                                    }else{
                                        System.out.println("Ingrese el nombre");
                                        String nombre = Lectura.getString();
                                        System.out.println("Ingrese el rut");
                                        String rut = Lectura.getString();
                                        Compositor c1 = new Compositor(nombre,rut);
                                        lco.ingresa(c1);
                                        }
                                    
                                 break;
                            case 3: 
                                     System.out.println("Seleccione el compositor de la cancion "+lco.getLargo());
                                    if(lco.getLargo()>0){
                                        ListadoCompositor();
                                        String nombre = Lectura.getString();
                                        Compositor c1 = lco.buscar(nombre);
                                        System.out.println("Ingrese Titulo de la cancion");
                                        String titulo = Lectura.getString();
                                        Cancion ca = new Cancion(titulo,c1);
                                        System.out.println("L "+lco.getLargo());
                                    }else{
                                        System.out.println("No existen compositores en la APP, por favor ingresesar a la opcion 2");
                                    }
                                 break;
                            case 4:
                                    ListadoCompositor();
                                    System.out.println("Seleccione el compositor "+lco.getLargo());
                                    String nombre = Lectura.getString();
                                    Compositor c1 = lco.buscar(nombre);
                                    System.out.println("Nombre: "+c1.getNombre()+ "rut: "+c1.getRut());
                                 break;
                            case 5:
                                 break;
                            case 6:
                                 break;
                            case 7:
                                 break;
                            case 8:
                                 break;
                        }
                        MenuPrincipal();
                        opcion = Lectura.getInt();
                }
                
}
    
    public static void MenuPrincipal(){
        System.out.println("*************************** Menu ***************************");
        System.out.println("*1.- Ingresar Disco                                        *");
        System.out.println("*2.- Ingresar Compositor                                   *");
        System.out.println("*3.- Ingresar canciones a un disco                         *");
        System.out.println("*4.- Buscar informacion de compositor                      *");
        System.out.println("*5.- Buscar compositor por disco                           *");
        System.out.println("*6.- Eliminar compositor                                   *");
        System.out.println("*7.- Ordenar alfabeticamente por nombre de canciones       *");
        System.out.println("*8.- Despliegue el titulo del disco que contiene la cancion*");
        System.out.println("*9.- Salir                                                 *");
        System.out.println("************************************************************");
    }
    
    public static void ListadoCompositor(){
        for(int i=0; i<=lco.getLargo();i++){
            System.out.println("Compositor: " + lco.getCompositor(i).getNombre());
        }
        
    }
}
