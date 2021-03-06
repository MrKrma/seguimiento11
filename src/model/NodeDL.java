package model;

public class NodeDL {
	
	//----------------------------------------------------- Attributes
	private String num;
	private Player p;
	private NodeDL prev;
	private NodeDL next;
	
	//----------------------------------------------------- Getters and Setters
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		this.p = p;
	}
	public NodeDL getPrev() {
		return prev;
	}
	public void setPrev(NodeDL prev) {
		this.prev = prev;
	}
	public NodeDL getNext() {
		return next;
	}
	public void setNext(NodeDL next) {
		this.next = next;
	}
	
	//----------------------------------------------------- Constructor
	public NodeDL(String num, Player p) {
		this.num = num;
		this.p = p;
	}
}
