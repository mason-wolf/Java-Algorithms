package storage;
import app.Task;
import app.Technician;

public interface Reader {
	
	Task getTask(Task id);
	Technician getTechnician(Technician id);
	
}
