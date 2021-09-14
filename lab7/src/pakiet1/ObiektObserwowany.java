
package pakiet1;


public class ObiektObserwowany implements InterfaceObserwowany{
    private int status=1;
    private java.util.ArrayList<InterfaceObserwator> listaObserwatorow = 
            new java.util.ArrayList();
@Override
public void dodajObserwatora(InterfaceObserwator obiektObserwatora){
    listaObserwatorow.add(obiektObserwatora);
}
@Override
public void usunObserwatora(InterfaceObserwator obiektObserwatora){
    listaObserwatorow.remove(obiektObserwatora);
}
@Override
public void powiadomObserwatorow(){
    for(InterfaceObserwator wart:listaObserwatorow){
        wart.aktualizuj(status);
    }
}

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        powiadomObserwatorow();
    }

}
