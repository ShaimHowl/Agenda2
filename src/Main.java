import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la agenda, por favor elija una opción:");
        System.out.println("  1. Crear un nuevo contacto.");
        System.out.println("  2. Buscar contactos existentes.");
        System.out.println("  3. Actualizar un contacto existente.");
        System.out.println("  4. Eliminar un contacto existente.");
        System.out.println("  5. Salir.");

        System.out.print("Escoge una opcion ");
        int opcion = sc.nextInt();

        System.out.println("Has escogido el numero " + opcion);







    }
}