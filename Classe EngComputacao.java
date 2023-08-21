package ex210823;

public class EngComputacao extends Profissao {

    private boolean hardware, software, redes;

    public boolean isHardware() {
        return hardware;
    }

    public void setHardware(boolean hardware) {
        this.hardware = hardware;
    }

    public boolean isSoftware() {
        return software;
    }

    public void setSoftware(boolean software) {
        this.software = software;
    }

    public boolean isRedes() {
        return redes;
    }

    public void setRedes(boolean redes) {
        this.redes = redes;
    }            
}
