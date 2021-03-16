package entradabloggfr;
/**
 *Clase para manejar las entradas de un blog.
 * @author German
 * @since 16-3-2021
 * @version 2.3
 */
public class EntradaBlogGFR {
    
	//separador es el ccarácter que separa ENTRADA DE del
	public char separador=':';
	private int id;
	private String texto;
        
        	//nombre del autor
	private String autor;

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción. 
     * 
     * @param id Id correspondiente al autor que se va a crear.
     * @param autor Nombre del autor.
     * @param texto Mensaje que muestrará el usuario.
     * @throws IllegalArgumentException
     */
	public EntradaBlogGFR(int id,String autor,String texto) throws IllegalArgumentException{
                    if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
                    this.id=id;
                    this.autor=autor;
                    this.texto=texto;
	}
            
       /**
       * Método toString sobreescrito para mostrar un mensaje del usuario al llamarse.
       * @return Devuelve la cadena de texto que se ha creado a partir del autor y el texto. 
       */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}

    /**
     * Devuelve el número de la entrada.
     * @return El numero del id del objeto creado.
     */
	public int getId(){
		return this.id;
	}

    /**
     * Devuelve el texto completo de la entrada.
     * @return El mensaje del objeto.
     */
	public String getTexto(){
		return this.texto;
	}
        
    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas.
     * @return El autor en letras mayúsculas.
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
    /**
     * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor.
     * @return
     */
	public String devuelveAutor(){
		return this.autor;
	}

	public static void main(String[] args) {
                    EntradaBlogGFR e1=new EntradaBlogGFR(3,"German","Últimas noticias, está disponible BixBy 2.0");
                    System.out.println(e1);
	}
    
}
