
package pakiet1;

public interface InterfaceObserwowany {
    public void dodajObserwatora(InterfaceObserwator obiektObserwatora);
    public void usunObserwatora(InterfaceObserwator obiektObserwatora);
    public void powiadomObserwatorow();
}
