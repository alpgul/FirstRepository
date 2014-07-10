package tr.tutorial.JSF_Tutorial;

public class paymentController {
	public boolean isRegisterCompleted() {
		return registerCompleted;
	}
	public void setRegisterCompleted(boolean registerCompleted) {
		this.registerCompleted = registerCompleted;
	}
	public int getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
	public boolean registerCompleted = true;
	public int orderQty = 99;
}
