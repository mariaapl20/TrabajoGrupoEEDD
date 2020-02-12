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


	public void cambio() {}
}

