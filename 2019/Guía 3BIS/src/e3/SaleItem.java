package e3;

public class SaleItem
{
	private int id;
	private String description;
	private int amount;
	private float unitPrice;
	
	public SaleItem(int id, String description, int amount, float unitPrice)
	{
		setId(id);
		setDescription(description);
		setAmount(amount);
		setUnitPrice(unitPrice);
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	public void setUnitPrice(float unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public float getUnitPrice()
	{
		return unitPrice;
	}
	
	public float calculateTotalCost()
	{
		float totalCost = getUnitPrice() * getAmount();
		return totalCost;
	}
	
	public String getData()
	{
		String data = "[Sale item] Id: " + getId() + " | Description: " + getDescription() + " | Amount: " + getAmount() + " | Unit price: " + getUnitPrice() + " | Total cost: " + calculateTotalCost();
		return data;
	}
}