public class Herencia {

    public static void main(String[] args) {
        
        Hija pedro = new Hija();
        
        pedro.setNombre("PEDRO");
        pedro.setEdad(20);
        pedro.setSexo('M');
        
        pedro.setNumeroEmpleado(1521);
        pedro.setPuesto("ADMINISTRADOR");
        pedro.setDepartamento("SISTEMAS");
        
        System.out.println("Nombre del empleado: " + pedro.getNombre());
        System.out.println("Puesto del empleado: " + pedro.getPuesto());
                
    }
}
