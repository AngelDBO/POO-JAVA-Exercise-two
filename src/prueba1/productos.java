package prueba1;

import javax.swing.JOptionPane;

public class productos {

    public static void main(String[] args) {
        vendedor prod = new vendedor();
        int valor;
        int op = 0;

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una operacion a realizar!!\n\n " + "[1]Ingresar producto \n"
                    + "[2]Modificar nombre del producto \n" + "[3]Modificar el codigo del producto \n" + "[4]Modificar precio del producto \n"
                    + "[5]Modificar peso del producto \n" + "[6]modificar fecha de vencimiento \n" + "[7]Modificar disponibilidad del prodcuto \n"
                    + "[8]Mostrar informacion del porducto \n" + "[9]Salir del programa"));

            switch (op) {
                case 1:

                    JOptionPane.showMessageDialog(null, "Has seleccionado la operacion \n\n <<Ingresar produto>>");
                    prod.setNproducto(JOptionPane.showInputDialog("Ingresa el nombre del producto:"));
                    prod.setcodigoP(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto")));
                    prod.setPrecioP(Float.parseFloat(JOptionPane.showInputDialog("Ingrese precio del producto")));
                    prod.setPesoP(Float.parseFloat(JOptionPane.showInputDialog("Ingrese peso del producto")));
                    prod.setFecha_V(JOptionPane.showInputDialog("Ingrese fecha de vencimiento del producto"));
                    prod.setStock(Float.parseFloat(JOptionPane.showInputDialog("Ingrese productos disponibles")));
                    break;

                case 2:
                    prod.setNproducto(JOptionPane.showInputDialog("Modifique el nombre del producto"));
                    JOptionPane.showMessageDialog(null, "El nombre del producto se modifico con exito!");
                    break;

                case 3:
                    prod.setcodigoP(Integer.parseInt(JOptionPane.showInputDialog("Modifique el codigo del producto")));
                    JOptionPane.showMessageDialog(null, "El codigo del producto se moficó  con exito");
                    break;

                case 4:
                    prod.setPrecioP(Float.parseFloat(JOptionPane.showInputDialog("Modifique el precio del producto")));
                    JOptionPane.showMessageDialog(null, "El precio del producto se moficó  con exito");
                    break;

                case 5:
                    prod.setPesoP(Float.parseFloat(JOptionPane.showInputDialog("Modifique el peso del producto")));
                    JOptionPane.showMessageDialog(null, "El peso del producto se moficó  con exito");
                    break;

                case 6:
                    prod.setFecha_V(JOptionPane.showInputDialog("modifique la fecha de vencimiento del producto"));
                    JOptionPane.showMessageDialog(null, "La fecha de vencimiento del producto se moficó  con exito");
                    break;

                case 7:
                    prod.setStock(Float.parseFloat(JOptionPane.showInputDialog("Modifique la cantidad de productos disponibles")));

                case 8: //JOptionPane.showMessageDialog(null, "La informacion del producto es la siguiente"+prod.getInfoProducto());

                    JOptionPane.showMessageDialog(null, "El nombre del producto: " + prod.getNproducto() + "\n"
                            + "El código del producto: " + prod.getcodigoP() + "\n"
                            + "El precio del producto: " + prod.getPrecioP() + "\n"
                            + "El peso del producto es: " + prod.getPesoP() + "Kg" + "\n"
                            + "La fecha de vencimiento es: " + prod.getFecha_V() + "\n"
                            + "Total productos disponibles: " + prod.getStock() + "\n"
                    );
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Adios!!!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida!!..Intenta nuevamente ");
                    break;

            }

        } while (op != 9);
    }

}
