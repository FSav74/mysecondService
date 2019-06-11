package mysecondService.bean;

public class Door {
	private String idDoor;
	private String status;
	
	public Door(String idDoor, String status) {
		this.idDoor = idDoor;
		this.status = status;
	}
	public String getIdDoor() {
		return idDoor;
	}
	public void setIdDoor(String idDoor) {
		this.idDoor = idDoor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
