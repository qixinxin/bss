package cn.bjtc.model;

public class Motidx {

	private Integer id;
	private String idxname;
	private Integer tblid;
	private Integer colid;
	private Integer biztype;
	private String tblname;
	private String colname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdxname() {
		return idxname;
	}
	public void setIdxname(String idxname) {
		this.idxname = idxname;
	}
	public Integer getTblid() {
		return tblid;
	}
	public void setTblid(Integer tblid) {
		this.tblid = tblid;
	}
	public Integer getColid() {
		return colid;
	}
	public void setColid(Integer colid) {
		this.colid = colid;
	}
	public Integer getBiztype() {
		return biztype;
	}
	public void setBiztype(Integer biztype) {
		this.biztype = biztype;
	}
	public String getTblname() {
		return tblname;
	}
	public void setTblname(String tblname) {
		this.tblname = tblname;
	}
	public String getColname() {
		return colname;
	}
	public void setColname(String colname) {
		this.colname = colname;
	}
}
