/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

public class Expedicion extends Thread {
    private Naves nave;
    private Planeta planeta;

    public Expedicion(Naves nave, Planeta planeta) {
        this.nave = nave;
        this.planeta = planeta;
    }

    public Naves getNave() {
        return nave;
    }

    public void setNave(Naves nave) {
        this.nave = nave;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public void run() {
        
    }
    

}
