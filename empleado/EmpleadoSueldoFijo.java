package empleado;

public class EmpleadoSueldoFijo extens Empleado{
    //atributos
    private double sueldoFijo;

    //constructores
    public EmpleadoSueldoFijo(){
        super();
    }
    public EmpleadoSueldoFijo(string nombre,int edad, string tipoRelacionLaboral,double sueldoFijo){
        super(nombre,edad,tipoRelacionLaboral);
        this.sueldoFijo=sueldoFijo;
    }
    public double GetsueldoFijo(){
        
    }

}