package in.hari.java.ParserApp.model;

public class Signer {
	
	private String email = null;
	
	private String name = null;
	
	private String recipientId = null;
	
	private String routingOrder = null;
	
	private Tabs tabs = null;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getRoutingOrder() {
		return routingOrder;
	}

	public void setRoutingOrder(String routingOrder) {
		this.routingOrder = routingOrder;
	}

	public Tabs getTabs() {
		return tabs;
	}

	public void setTabs(Tabs tabs) {
		this.tabs = tabs;
	}

	@Override
	public String toString() {
		return "Signer [email=" + email + ", name=" + name + ", recipientId=" + recipientId + ", routingOrder="
				+ routingOrder + ", tabs=" + tabs + "]";
	}
	
}
