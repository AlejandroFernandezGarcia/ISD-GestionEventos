package es.udc.ws.events.model.event;

import es.udc.ws.util.exceptions.InstanceNotFoundException;
import java.sql.Connection;
import java.util.Calendar;
import java.util.List;

public interface SqlEventDao {

    public Event create(Connection connection, Event event);

    public void update(Connection connection, Event event)
    		throws InstanceNotFoundException;
    public void delete(Connection connection, Long eventId)
    		throws InstanceNotFoundException;
    public Event find(Connection connection, Long eventId)
            throws InstanceNotFoundException;
    public List<Event> findByKeyword(Connection connection, String clave, Calendar fechaIni, Calendar fechaFin)
    		throws InstanceNotFoundException;
//    public int response(Connection connection,String username,Long eventId,boolean asistencia)
//    		throws InstanceNotFoundException;
//    public ArrayList getResponses(Connection connection, Event evento, boolean respuesta) 
//    		throws InstanceNotFoundException;
//    public ArrayList getResponses_by_ID(Connection connection, Long eventId)
//    		throws InstanceNotFoundException;
}
