package dev.ibraheem.project1;
import java.time.LocalDateTime;

public class StatusInfo {
		// fields
		private int status_id;
		private String status_name;
		private LocalDateTime status_date_time;
		public StatusInfo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public StatusInfo(int status_id, String status_name, LocalDateTime status_date_time) {
			super();
			this.status_id = status_id;
			this.status_name = status_name;
			this.status_date_time = status_date_time;
		}
		public int getStatus_id() {
			return status_id;
		}
		public void setStatus_id(int status_id) {
			this.status_id = status_id;
		}
		public String getStatus_name() {
			return status_name;
		}
		public void setStatus_name(String status_name) {
			this.status_name = status_name;
		}
		public LocalDateTime getStatus_date_time() {
			return status_date_time;
		}
		public void setStatus_date_time(LocalDateTime status_date_time) {
			this.status_date_time = status_date_time;
		}
		
}