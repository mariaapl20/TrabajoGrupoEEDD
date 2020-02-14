public class Profesor implements IPersona, ITrabajador, IProfesor{

	private String sNombre, sApellidos, sDni, sUniversidad;
	private int iEdad, iSueldo, iAntiguedad, iNumAlumnos;
	private boolean bFuncionario;
	
	private Profesor(String sNombre, String sApellidos, String sDni, int iEdad) {
		this.setsNombre(sNombre);
		this.setsApellidos(sApellidos);
		this.setsDni(sDni);
		this.setiEdad(iEdad);
	}
	@Override
	public String getsNombre() {
		return sNombre;
	}
	@Override
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	@Override
	public String getsApellidos() {
		return sApellidos;
	}
	@Override
	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}
	@Override
	public String getsDni() {
		return sDni;
	}
	@Override
	public void setsDni(String sDni) {
		this.sDni = sDni;
	}
	@Override
	public String getsUniversidad() {
		return sUniversidad;
	}
	@Override
	public void setsUniversidad(String sUniversidad) {
		this.sUniversidad = sUniversidad;
	}
	@Override
	public int getiEdad() {
		return iEdad;
	}
	@Override
	public void setiEdad(int iEdad) {
		this.iEdad = iEdad;
	}
	@Override
	public int getiSueldo() {
		return iSueldo;
	}
	@Override
	public void setiSueldo(int iSueldo) {
		this.iSueldo = iSueldo;
	}
	@Override
	public int getiAntiguedad() {
		return iAntiguedad;
	}
	@Override
	public void setiAntiguedad(int iAntiguedad) {
		this.iAntiguedad = iAntiguedad;
	}
	@Override
	public int getiNumAlumnos() {
		return iNumAlumnos;
	}
	@Override
	public void setiNumAlumnos(int iNumAlumnos) {
		this.iNumAlumnos = iNumAlumnos;
	}
	@Override
	public boolean isbFuncionario() {
		return bFuncionario;
	}
	@Override
	public void setbFuncionario(boolean bFuncionario) {
		
		this.bFuncionario = bFuncionario;
	}

	public String Apellido() {
		sResultado="";
		sResultado="Los apellidos de la persona es"+ this.getsApellidos();
		return sResultado;
	}
	
	public String Dni() {
		sResultado="";
		sResultado="El dni de la persona es" +this.getsDni();
		return sResultado;
	}

	public String sDimeUniversidad() {
		sResultado="";
		sResultado="Estas en " +this.getsDni()+" universidad";
		return sResultado;
	}
	
	public int Edad() {
		sResultado="";
		sResultado="La edad de la persona es"+ this.getsEdad();
		return sResultado;
	}
	
	public string Nombre() {
		sResultado="";
		sResultado="El nombre de la persona es"+ this.getsNombre();
		return sResultado;
	}
	
	public String Funcionario() {
		boolean bFuncionario=true;
		String sResultado="";
		if(bFuncionario) {
			sResultado="La persona es funcionario."
		}else{
			sResultado="La persona no es funcionario."
		}
		return sResultado;	
	}
	
	public string Antiguedad() {
		sResultado="";
		sResultado="La Antiguedad de la persona es"+ this.getiAntiguedad();
		return sResultado;
	}
	
	
	
	public void cambio() {}
}

