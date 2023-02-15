package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private int pid;
	private String pname;
	private long pph_no;
	private String pblood;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public long getPph_no() {
		return pph_no;
	}

	public void setPph_no(long pph_no) {
		this.pph_no = pph_no;
	}

	public String getPblood() {
		return pblood;
	}

	public void setPblood(String pblood) {
		this.pblood = pblood;
	}
}