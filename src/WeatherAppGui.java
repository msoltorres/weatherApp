import javax.swing.*;
import java.awt.*;

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
    }
}