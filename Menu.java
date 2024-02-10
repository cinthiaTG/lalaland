import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void menu_administrador(){
        System.out.println("1) agregar un usuario: ");
        System.out.println("2) agregar un libro: ");
        System.out.println("3) agregar una revista: ");

    }
    public void eleccion()throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int elcc= Integer.parseInt(bufer.readLine());
        boolean band= false;
        int opc=1;
        do {
            menu_administrador();
            if(elcc==1){
                Administrador admin = new Administrador();
                admin.Crear_usuario();
            } else if (elcc==2) {
                Administrador admin = new Administrador();
                admin.Agregar_libro();
            }else if(elcc==3){

            }else {

            }
            System.out.println("quieres segir en el programa?");
            System.out.println("1) si \n2)no");
            opc=Integer.parseInt(bufer.readLine());
            if (opc==1){
                band=true;
            }else {
                band=false;
            }

        }while (band==true);
    }
}
