package exepciones;

import java.util.Date;

public class ContactoNoExiste extends Exception
{
    private Date horaDelError;

    public ContactoNoExiste(String message) {
        super(message);
        this.horaDelError = new Date();
    }

    private Date getHoraDelError() {
        return horaDelError;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " "+getHoraDelError();
    }
}
