package prueba1;

import javax.swing.JOptionPane;

public class vendedor {

    private String Nproducto;
    private int codigoP;
    private float precioP;
    private float pesoP;
    private String fecha_V;
    private float stock, pagar;

    vendedor() {
        codigoP = 0;
        Nproducto = fecha_V = "";
        precioP = pesoP = stock = pagar = -1;
    }

    vendedor(String producto, String codigoP, float precio, float peso, String fecha, float pago) {
        this.Nproducto = producto;
        codigoP = codigoP;
        precioP = precio;
        pesoP = peso;
        fecha_V = fecha;
        stock = 0;
        pagar = pago;
    }

    vendedor(String Nproducto, int codigoP, float precio_P, float pesoP, String fecha_V, float stock, float pagar) {

        this.Nproducto = Nproducto;
        this.codigoP = codigoP;
        this.precioP = precioP;
        this.pesoP = pesoP;
        this.stock = stock;
        this.pagar = pagar;

    }

    public String getNproducto() {
        return Nproducto;
    }

    public void setNproducto(String Nproducto) {
        this.Nproducto = Nproducto;
    }

    public int getcodigoP() {
        return codigoP;
    }

    public void setcodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public float getPrecioP() {
        return precioP;
    }

    public void setPrecioP(float precioP) {
        this.precioP = precioP;
    }

    public float getPesoP() {
        return pesoP;
    }

    public void setPesoP(float pesoP) {
        this.pesoP = pesoP;
    }

    public String getFecha_V() {
        return fecha_V;
    }

    public void setFecha_V(String fecha_V) {
        this.fecha_V = fecha_V;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public void valorproducto(float valor) {
        this.pagar = this.precioP;
        this.pagar *= valor;

    }

    void getInfoProducto() {
        String x = "Información del producto: \n";
        x += "El nombre del producto: " + Nproducto + "\n";
        x += "El código del producto: " + codigoP + "\n";
        x += "El precio del producto: " + precioP + "\n";
        x += "El peso del producto es: " + pesoP + "\n";
        x += "La fecha de vencimiento es: " + fecha_V + "\n";
        x += "Total productos disponibles: " + stock + "\n";
        JOptionPane.showMessageDialog(null, x);
    }

}
