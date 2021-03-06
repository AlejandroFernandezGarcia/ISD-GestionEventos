package es.udc.ws.events.model.response;

import java.sql.Connection;
import java.util.ArrayList;

import es.udc.ws.util.exceptions.InstanceNotFoundException;

public interface SqlResponseDao {
	public Response create(Connection connection, Response response)
			throws InstanceNotFoundException;

	public Long update(Connection connection, Response response)
			throws InstanceNotFoundException;

	public void delete(Connection connection, Long responseId)
			throws InstanceNotFoundException;

	public ArrayList<Response> find(Connection connection, Long eventId,
			Boolean response) throws InstanceNotFoundException;

	public Response findById(Connection connection, Long responseId)
			throws InstanceNotFoundException;

	public Response findResponseByEventUser(Connection connection,
			String userName, Long eventId);

	public Long numResponsesToEvent(Connection connection, Long eventId,
			Boolean assists);

}
