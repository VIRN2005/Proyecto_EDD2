package proyecto_edd2;

import javax.swing.JProgressBar;

public class AdmBarra extends Thread {

    private JProgressBar barra;
    private boolean flag;

    public AdmBarra(JProgressBar barra) {
        this.barra = barra;
        this.flag = false;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void run() {
        barra.setMaximum(5);
        
        for (int i = 1; i <= 5; i++) {
            barra.setValue(i);
            try {
                //System.out.println("entre");
                Thread.sleep(1000);//Para que se detenga la barra cuando le diga que se detenga
            } catch (InterruptedException ex) {
            }
        }

        barra.setValue(0);
        flag = false;
    }
}
