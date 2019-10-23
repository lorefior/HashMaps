package hashEjemplo;

public class Persona {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private Integer dni;
	private Integer edad;
	private String estadoCivil;
	private String mail;

	public Persona(String nombre, String apellido, String nacionalidad, Integer dni, Integer edad, String estadoCivil,
			String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.dni = dni;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.mail = mail;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getMail() {
		return mail;
	}

	public void setMailn(String mail) {
		this.mail = mail;
	}

}