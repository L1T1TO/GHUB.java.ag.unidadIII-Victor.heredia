package empleado;

public class EmpleadoPorHoras extens Empleado{
    private double tarifaPorHoras = tarifaPorHoras;
    private int horasTrabajadas;
    //constructores
    public EmpleadoPorHoras(){
        super();
    }
    public EmpleadoPorHoras(double tarifaPorHoras,int horasTrabajadas){
        super();
        this.tarifaPorHoras = tarifaPorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }
    public EmpleadoPorHoras(string nombre, int edad , string tipoRelacionLaboral,double tarifas tarifaPorHoras,int horasTrabajadas){
        super(nombre,edad,tipoRelacionLaboral);
        this.tarifaPorHoras = tarifaPorHoras;
        this.horasTrabajadas = horasTrabajadas;

    }
    public double getTarifaPorHoras(){
        return tarifaPorHoras;
    }
    public int gethorasTrabajadas;
    return horasTrabajadas;
}