public class Hija extends Padre{
    
    private int numeroEmpleado;
    private String departamento;
    private String puesto;
    
    public Hija(){
    }
    
    public Hija(String nombre, int edad, char sexo, int numeroEmpleado, String departamento, String puesto){ 
        super(nombre,edad,sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}