package ex02;

/**
 *
 * @author rrych
 */
public class ExericioMouseObjetoConcretoAula02Ex01 {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        
        m1.modelo = "Logitech";
        m1.bluetooth = false;
        m1.carregado = 15;
        m1.formato = "Ergonomico";
        m1.plug = true;
        
        m1.status();
        m1.ligado();
        m1.plug();
        m1.bateria();
        
        
        
    }
    
}
