import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Cursor;

/* Se define una nueva clase llamada WeatherAppGui que hereda de JFrame.
Esto significa que nuestra clase representa una ventana (frame) en la aplicación. */
public class WeatherAppGui extends JFrame {
    // constructor para la inicialización de los componentes de la ventana
    public WeatherAppGui() {
        // añadimos título a la aplicación llamando al constructor de la clase Jframe
        super("Weather App");

        // configuración para terminar el programa una vez que se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // configuramos el tamaño de nuestra gui
        setSize(450, 650);

        // configuración para que nuestra gui esté en el centro de la pantalla
        setLocationRelativeTo(null);

    // hacemos que nuestro adm de diseño sea nulo para posicionar manualmente nuestros componentes
        setLayout(null);

        // configuración que previene que se edite el tamaño de nuestra gui
        setResizable(false);

        addGuiComponents();
    }

    private void addGuiComponents() {
    // campo de búsqueda
        JTextField searchTextField = new JTextField();

        // configuramos la locación y tamaño de nuestro componente
        searchTextField.setBounds(15, 15, 351, 45);

        // cambiamos el estilo y tamaño de la fuente
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);

    //botón de búsqueda
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        add(searchButton);
        //cambiamos el cursor para que tenga un hover sobre este botón
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
    }



       // esto lo usamos para crear imagenes en nuestros componentes
    private ImageIcon loadImage(String resourcePath) {
        try{
            //leer la imagen de la ruta que le dimos
            BufferedImage image = ImageIO.read(new File(resourcePath));

            // nos devuelve un icono para que nuestro componente pueda renderizarlo
            return new ImageIcon(image);
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("no se pudo encontrar el recurso");
        return null;
    }
}