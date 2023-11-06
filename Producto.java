public class Producto {

    private String nombreproducto;
    private String tipo;
   
    private int cantidadproducto;

    private int cantidadminima;
    private double precio;


    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public int getCantidadminima() {
        return cantidadminima;
    }

    public void setCantidadminima(int cantidadminima) {
        this.cantidadminima = cantidadminima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(String nombreproducto, String tipo, int cantidadproducto , int cantidadminima, double precio) {
        this.nombreproducto = nombreproducto;
        this.tipo= tipo;
        this.cantidadproducto = cantidadproducto;
        this.cantidadminima = cantidadminima;
        this.precio = precio;

    }

    public void cambiarProducto(String pnombreproducto, String ptipo, int pcantidadproducto , int pcantidadminima, double pprecio )
    {
        nombreproducto=pnombreproducto;
        tipo=ptipo;
        cantidadproducto=pcantidadproducto;
        cantidadminima=pcantidadminima;
        precio=pprecio;

    }

    public double dineroObtenido(){

Double dineroTotal;

dineroTotal = cantidadproducto * precio;

return dineroTotal;

    }

    public String toStringPromedio() {
        String p = "la cantidad de dinero obtenida de: " +nombreproducto+ " es un total de: "+ dineroObtenido()+"$";
        return p;
    }

    @Override
    public String toString() {
        String p = "Nombre del Producto: " +
                nombreproducto+
                "\nTipo de Producto : Producto de "+ tipo +
                "\nCantidad actual del producto en la tienda: " + cantidadproducto +
                "\nCantidad mínima para abastecimiento del producto:" + cantidadminima +
                "\nPrecio base de venta por unidad.: " + precio +
                "\nPrecio final con IVA:";
        return p;
    }




}


